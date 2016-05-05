package com.cmos.ipa.client;

import com.cmos.ipa.pojo.MsgHeart;
import com.cmos.ipa.pojo.MsgParamdownload;
import com.cmos.ipa.utils.ByteUtil;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.ScheduledFuture;

/**
 * <code>参数下载处理器</code>
 * @author Hardy
 * @date 2016/5/4 4:18
 * @version 1.0
 */
public class ParamdownloadHandler extends ChannelInboundHandlerAdapter {

    private boolean canDo;
    private boolean flag;
    private Logger log;
    private DataTool dataTool;
    private MsgHeart mh;
    private MsgParamdownload mpd;
    private volatile ScheduledFuture<?> heartBeat;

    public ParamdownloadHandler(){
        this.canDo = true;
        this.flag  = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
        this.mh  = new MsgHeart();
        this.mpd = new MsgParamdownload();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        MsgParamdownload msgpl;
        ByteBuf m = (ByteBuf) msg;
        byte[] receiveData= dataTool.getBytesFromByteBuf(m);
        Global.print(dataTool.bytes2hex(receiveData));

        msgpl = new MsgParamdownload().decoded(receiveData);
        if(msgpl != null && msgpl.getStatus() == 1){
            Global.print("COLLETCONTAB:"+msgpl.getColletcontab()+"/COLLECTPROTOCOL:"
                    +msgpl.getCollectProtocol());
            Global.COLLETCONTAB = msgpl.getColletcontab();
            Global.COLLECTPROTOCOL = msgpl.getCollectProtocol();
        }
    }

    @Override
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
