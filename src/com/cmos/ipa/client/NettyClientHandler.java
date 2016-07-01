package com.cmos.ipa.client;

import com.cmos.ipa.deviceclient.BacnetClient;
import com.cmos.ipa.deviceclient.TCPClient;
import com.cmos.ipa.pojo.MsgHeart;
import com.cmos.ipa.pojo.MsgOrder;
import com.cmos.ipa.pojo.MsgParamdownload;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.ScheduledFuture;

import java.util.concurrent.TimeUnit;

/**
 * <code>NettyclientHander</code>
 * @author Hardy
 * @date 2016/4/30 3:19
 * @version 1.0
 */
public class NettyClientHandler extends ChannelInboundHandlerAdapter {

    private boolean canDo = true;
    private Logger log;
    private DataTool dataTool;
    private MsgHeart mh;
    private MsgParamdownload mpd;
    private volatile ScheduledFuture<?> heartBeat;

    public NettyClientHandler() {
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

            canDo = false;
        }
    }


    @Override
    public synchronized void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        Channel ch=ctx.channel();
        ByteBuf m = (ByteBuf) msg;
        ByteBuf buf =  PooledByteBufAllocator.DEFAULT.heapBuffer(10);

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

                    System.err.println(Global.ThreadFlag);
                    System.err.println(Global.ThreadStart);
                    // 第一次心跳成功，启动心跳发送任务
                    if(msgh != null && msgh.getStatus() == 1){
                        if(Global.ThreadStart) {
                            log.log_info("Started HeartBeatTask ......");
                            heartBeat = ctx.executor().scheduleAtFixedRate(
                                    new HeartBeatHandler(ctx), 0, Global.HEART_TIME,
                                    TimeUnit.MILLISECONDS);

                            //开启告警报告任务
                            log.log_info("Started AlarmTask ......");
                            new AlarmHandler(ctx).start();

                            //开启状态报告任务
                            log.log_info("Started StatusTask ......");
                            new StatusHandler(ctx).start();

                            Global.ThreadStart = false;
                        }
                    }
                    break;
                case 0x04://D
                    log.log_info("ParamDownload response >>" + dataTool.bytes2hex(receiveData));
                    MsgParamdownload msgpl;

                    msgpl = new MsgParamdownload().decoded(receiveData);
                    if(msgpl != null && msgpl.getStatus() == 1){
                        log.log_info("COLLETCONTAB:" + msgpl.getColletcontab() + "/COLLECTPROTOCOL:"
                                + msgpl.getCollectProtocol());
                        Global.COLLETCONTAB = msgpl.getColletcontab();
                        Global.COLLECTPROTOCOL = msgpl.getCollectProtocol();
                    }
                    break;
                case 0x05:
                    log.log_info("Order response >>" + dataTool.bytes2hex(receiveData));
                    MsgOrder msgOrder;
                    msgOrder = new MsgOrder().decoded(receiveData);
                    //获取到指令消息后，往设备进行指令下发
                    log.log_info("msgOrder:"+msgOrder.getOrderPara());


                    //回写成功消息
                    MsgOrder mo = new MsgOrder();
                    mo.getHeader().setEventId(msgOrder.getHeader().getEventId());
                    mo.getHeader().setmId((byte)2);
                    mo.setStatus((byte)1);
                    buf.writeBytes(mo.encoded());
                    ch.writeAndFlush(buf);
                    break;
                default:
                    log.log_info(">>unknown response >>" + dataTool.bytes2hex(receiveData));
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
