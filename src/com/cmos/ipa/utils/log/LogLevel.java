package com.cmos.ipa.utils.log;

/**
 * <code>日志定义接口</code>
 * @author Hardy
 * @date 2016/4/27 17:55
 * @version 1.0
 */
public interface LogLevel {

    int TRACE = 0;  

    int DEBUG = TRACE + 1;

    int INFO = DEBUG + 1;

    int WARN = INFO + 1;

    int ERROR = WARN + 1;

    int FATAL = ERROR + 1;    


    String LOG_LEVEL = "LogLevel";
    
    String LOG_PATH = "LogPath";

    String LOG_NAME = "LogName";
    
    String LOG_GROUP = "LogGroup";
    
    String LOG_WHERE = "LogWhere";
    
    String LOG_LEVEL_CODES[] = {
        " TRACE ",
        " DEBUG ",
        " INFO  ",
        " WARN  ",
        " ERROR ",
        " FATAL ",
        " NOLOG "
    };

}