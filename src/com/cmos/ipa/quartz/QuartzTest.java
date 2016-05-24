package com.cmos.ipa.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Hardy on 2016/5/23 0023.
 */
public class QuartzTest {
    /** *//**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = new Date();
        String returnstr = DateFormat.format(d);

        String job_name ="11";
        String trigger_name ="22";
        try {
            System.out.println(returnstr+ "【系统启动】");
            QuartzManager.addJob(job_name,LogJob.class,trigger_name,"0 0 2 * * ?");
            Thread.sleep(10000);

            System.out.println("【移除定时】");
            QuartzManager.removeJob(job_name);
            Thread.sleep(10000);

            System.out.println("/n【添加定时任务】");
//            QuartzManager.addJob(job_name,LogJob.class,trigger_name,"0/3 * * * * ?");

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
