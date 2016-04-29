package com.cmos.ipa.service;


import com.cmos.ipa.pojo.Header;
import com.cmos.ipa.pojo.HeartReqBody;
import com.cmos.ipa.pojo.MsgHeart;
import com.cmos.ipa.utils.ByteUtil;
import com.cmos.ipa.utils.DataTool;
import io.netty.buffer.ByteBuf;

/**
 * <code>报文消息服务</code>
 * @author Hardy
 * @date 2016/4/30 3:34
 * @version 1.0
 */
public class SocketService {

    private DataTool dataTool;

    /**
     * @return 心跳请求hex
     */
    public String setHeartbeatReq(){
        MsgHeart mgh = new MsgHeart();
        Header header = new Header();
        header.setSendingTime(dataTool.getCurrentSeconds());
        header.setAgentNum(ByteUtil.IntToByte(1));
        HeartReqBody heartReqBody = new HeartReqBody();
        heartReqBody.setHeartBeat(ByteUtil.IntToByte(3));
        mgh.setHeader(header);
        mgh.setHeartReqBody(heartReqBody);
        byte[] respBytes=mgh.encoded();
        String respStr=dataTool.bytes2hex(respBytes);
        return respStr;
    }

}
