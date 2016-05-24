package com.cmos.ipa.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import java.text.ParseException;

/**
 * <code>定时器管理类</code>
 * @author Hardy
 * @date 2016/5/20 16:51
 * @version 1.0
 */
public class QuartzManager {

    //调度工厂
    private static SchedulerFactory sf = new StdSchedulerFactory();
    //工作任务组名称
    private static String JOB_GROUP_NAME = "group";
    //触发器组名称
    private static String TRIGGER_GROUP_NAME = "trigger";

    /**
     * 添加一个定时任务，使用默认的任务组名，触发器名，触发器组名
     * @param jobName
     * @param triggerName
     * @param time
     * @throws SchedulerException
     * @throws ParseException
     */
    public static void addJob(String jobName,Class<? extends Job> jobClass,String triggerName,String time)
            throws SchedulerException, ParseException{
        Scheduler sched = sf.getScheduler();
        //任务执行类 任务名 任务组，
        JobDetail jobDetail = newJob(jobClass)
                .withIdentity(jobName, JOB_GROUP_NAME)
                .build();
        //触发器名,触发器组
        CronTrigger trigger = newTrigger()
                .withIdentity(triggerName, TRIGGER_GROUP_NAME)
                .withSchedule(cronSchedule(time))
                .build();

        // 注册并进行调度
        sched.scheduleJob(jobDetail, trigger);
        // 启动调度器
        if(!sched.isShutdown())
            sched.start();
    }

    /**
     * 添加一个定时任务 使用自定义的任务组名，触发器名，触发器组名
     * @param jobName
     * @param jobGroupName
     * @param jobClass
     * @param triggerName
     * @param triggerGroupName
     * @param time
     * @throws SchedulerException
     * @throws ParseException
     */
    public static void addJob(String jobName,String jobGroupName,Class<? extends Job> jobClass,String triggerName,String triggerGroupName,String time)
            throws SchedulerException, ParseException{
        Scheduler sched = sf.getScheduler();
        //任务执行类 任务名 任务组，
        JobDetail jobDetail = newJob(jobClass)
                .withIdentity(jobName, jobGroupName)
                .build();
        //触发器名,触发器组
        CronTrigger trigger = newTrigger()
                .withIdentity(triggerName, triggerGroupName)
                .withSchedule(cronSchedule(time))
                .build();
        // 注册并进行调度
        sched.scheduleJob(jobDetail, trigger);
        // 启动调度器
        if(!sched.isShutdown())
            sched.start();
    }

    /**
     * 移除一个任务(使用默认的任务组名，触发器名，触发器组名)
     * @param jobName
     * @throws SchedulerException
     */
    public static void removeJob(String jobName) throws SchedulerException{
        Scheduler sched = sf.getScheduler();
        //停止触发器
        sched.pauseTrigger(new TriggerKey(jobName,TRIGGER_GROUP_NAME));
        //移除触发器
        sched.unscheduleJob(new TriggerKey(jobName,TRIGGER_GROUP_NAME));
        //删除任务
        sched.deleteJob(new JobKey(jobName,JOB_GROUP_NAME));
    }

    /**
     * 移除一个任务
     * @param jobName
     * @param jobGroupName
     * @param triggerName
     * @param triggerGroupName
     * @throws SchedulerException
     */
    public static void removeJob(String jobName,String jobGroupName,
                                 String triggerName,String triggerGroupName)
            throws SchedulerException{
        Scheduler sched = sf.getScheduler();
        //停止触发器
        sched.pauseTrigger(new TriggerKey(triggerName,triggerGroupName));
        //移除触发器
        sched.unscheduleJob(new TriggerKey(triggerName,triggerGroupName));
        //删除任务
        sched.deleteJob(new JobKey(jobName,jobGroupName));
    }

    }
