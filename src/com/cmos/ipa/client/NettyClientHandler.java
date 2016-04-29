package com.cmos.ipa.client;

import com.cmos.ipa.service.SocketService;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * <code>NettyclientHander</code>
 * @author Hardy
 * @date 2016/4/30 3:19
 * @version 1.0
 */
public class NettyClientHandler extends ChannelInboundHandlerAdapter {

    private DataTool dataTool;
    private SocketService socketService;
    private Logger log;

    public NettyClientHandler(SocketService socketService,DataTool dataTool) {
        this.dataTool = dataTool;
        this.socketService = socketService;
        this.log = Logger.getInstance();
    }

    @Override
    public synchronized void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        Channel ch=ctx.channel();
        ByteBuf m = (ByteBuf) msg;
        byte[] receiveData=dataTool.getBytesFromByteBuf(m);
        String receiveDataHexString=dataTool.bytes2hex(receiveData);
        String respStr;
        ByteBuf buf;
        //将缓冲区的数据读出到byte[]

        if(!dataTool.checkByteArray(receiveData)) {
            log.log_info(">>>>>bytes data is invalid,we will not handle them");
        }else{
            byte dataType=dataTool.getApplicationType(receiveData);
            switch(dataType){
                case 0x01://A
                    System.out.println("0x01");
                    break;
                case 0x02://B
                    System.out.println("0x02");
                    break;
                case 0x03://C
                    log.log_info("Heartbeat request");
                    respStr=socketService.setHeartbeatReq();
                    buf=dataTool.getByteBuf(respStr);
                    ch.writeAndFlush(buf);//心跳流程直接回消息
                    break;
                case 0x04://D
                    log.log_info("ParamDownload request");
//                    respStr=socketService.setParamDownloadResp();
//                    buf=dataTool.getByteBuf(respStr);
//                    ch.writeAndFlush(buf);
                    break;
                default:
                    log.log_info(">>unknown request ,log to log" + receiveDataHexString);
                    break;

            }

        }
    }

}
