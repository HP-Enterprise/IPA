package com.cmos.ipa.client;

import com.cmos.ipa.pojo.MsgHeart;
import com.cmos.ipa.pojo.MsgParamdownload;
import com.cmos.ipa.service.SocketService;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.concurrent.ScheduledFuture;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

/**
 * <code>NettyclientHander</code>
 * @author Hardy
 * @date 2016/4/30 3:19
 * @version 1.0
 */
public class NettyClientHandler extends ChannelInboundHandlerAdapter {

    private boolean canDo;
    private Logger log;
    private DataTool dataTool;
    private MsgHeart mh;
    private MsgParamdownload mpd;
    private volatile ScheduledFuture<?> heartBeat;

    public NettyClientHandler() {
        this.canDo = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
        this.mh  = new MsgHeart();
        this.mpd = new MsgParamdownload();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        while(canDo) {
            Channel channel =  ctx.channel();
            //开启参数下载
            log.log_info("Started Paramdownload ......");
            ByteBuf buffer_one = PooledByteBufAllocator.DEFAULT.heapBuffer(10);
            buffer_one.writeBytes(mpd.encoded());
            channel.writeAndFlush(buffer_one);

            //开启心跳任务
            log.log_info("Started HeartBeat ......");
            ByteBuf buffer_two = PooledByteBufAllocator.DEFAULT.heapBuffer(10);
            buffer_two.writeBytes(mh.encoded());
            channel.writeAndFlush(buffer_two);

            //开启告警报告任务
            log.log_info("Started AlarmTask ......");
            new AlarmHandler(ctx).start();

            //开启状态报告任务
            log.log_info("Started StatusTask ......");
            new StatusHandler(ctx).start();
            canDo = false;
        }
    }


    @Override
    public synchronized void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        ByteBuf m = (ByteBuf) msg;
        byte[] receiveData = dataTool.getBytesFromByteBuf(m);
        if (!dataTool.checkByteArray(receiveData)) {
            log.log_info(">>>>>bytes data is invalid,we will not handle them");
        } else {
            byte dataType = dataTool.getApplicationType(receiveData);
            switch (dataType) {
                case 0x03://C
                    log.log_info("Heartbeat response >>" + dataTool.bytes2hex(receiveData));
                    MsgHeart msgh;
                    msgh = new MsgHeart().decoded(receiveData);

                    // 第一次心跳成功，启动心跳发送任务
                    if(msgh != null && msgh.getStatus() == 1){
                        log.log_info("Started HeartBeatTask ......");
                        heartBeat = ctx.executor().scheduleAtFixedRate(
                                new HeartBeatHandler(ctx), 0, Global.HEART_TIME,
                                TimeUnit.MILLISECONDS);
                    }
                    break;
                case 0x04://D
                    log.log_info("ParamDownload response >>" + dataTool.bytes2hex(receiveData));
                    MsgParamdownload msgpl;
                    Global.print(dataTool.bytes2hex(receiveData));

                    msgpl = new MsgParamdownload().decoded(receiveData);
                    if(msgpl != null && msgpl.getStatus() == 1){
                        Global.print("COLLETCONTAB:"+msgpl.getColletcontab()+"/COLLECTPROTOCOL:"
                                +msgpl.getCollectProtocol());
                        Global.COLLETCONTAB = msgpl.getColletcontab();
                        Global.COLLECTPROTOCOL = msgpl.getCollectProtocol();
                    }
                    break;
                default:
                    log.log_info(">>unknown request >>" + dataTool.bytes2hex(receiveData));
                    break;

            }

        }
    }

        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
        throws Exception {
            cause.printStackTrace();
            if (heartBeat != null) {
                heartBeat.cancel(true);
                heartBeat = null;
            }
            ctx.fireExceptionCaught(cause);
        }
}
