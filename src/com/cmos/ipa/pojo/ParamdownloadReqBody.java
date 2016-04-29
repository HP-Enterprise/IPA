package com.cmos.ipa.pojo;

/**
 * <code>参数下载请求实体类</code>
 * @author Hardy
 * @date 2016/4/29 19:40
 * @version 1.0
 */
public class ParamdownloadReqBody {

    //参数下载 默认为4
    private Byte paraDownload;

    public Byte getParaDownload() {
        return paraDownload;
    }

    public void setParaDownload(Byte paraDownload) {
        this.paraDownload = paraDownload;
    }
}
