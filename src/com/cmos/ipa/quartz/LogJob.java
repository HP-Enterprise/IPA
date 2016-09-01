package com.cmos.ipa.quartz;

import com.cmos.ipa.utils.FileUtil;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <code>日志定时器Job</code>
 * @author Hardy
 * @date 2016/5/20 16:51
 * @version 1.0
 */
public class LogJob implements Job{

    Logger log =  Logger.getInstance();

//    final SimpleDateFormat YY_FORMATTER = new SimpleDateFormat("yyyyMMdd");

    private int fewMonth = 0;

    public LogJob(){}

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.log_info("★★★★★★日志定时删除任务启动★★★★★★");
        //获取X月前的时间[整型]
        fewMonth = getFewMonth(Global.LogSaveMonth);
        //获取日志的存储路径
        String logDir = System.getProperty("user.dir") + File.separator+"log";
        //得到日志存储路径下所有的子目录或文件
        String[] fileList = FileUtil.getDirChildren(new File(logDir));
        //循环删除处理过期日志
        for (int i=0; i<fileList.length; i++) {
            if(fileList[i] != null && new File(fileList[i]).isDirectory() && Integer.parseInt(fileList[i]) < fewMonth){
                FileUtil.deleteDir(new File(fileList[i]));
            }
        }

    }

    /**
     * 获取几个月前的整型时间格式
     * @param month
     * @return
     */
    public static int getFewMonth(int month){
    	SimpleDateFormat yy_formatter = new SimpleDateFormat("yyyyMMdd");
        int aFewMonthAgo = 0 ;
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -month);
        aFewMonthAgo = Integer.parseInt(yy_formatter.format(c.getTime()));
        return aFewMonthAgo;
    }


}
