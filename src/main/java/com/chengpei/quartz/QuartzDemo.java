package com.chengpei.quartz;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.text.ParseException;
import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by chengpei on 2015/8/5.
 */
public class QuartzDemo {

    public static void main(String[] args) throws SchedulerException, ParseException, ClassNotFoundException {

        // 通过SchedulerFactory获取一个调度器实例
        SchedulerFactory sf = new StdSchedulerFactory();

        Scheduler scheduler = sf.getScheduler();

        // 通过过JobDetail封装QuartJob，同时指定Job在Scheduler中所属组及名称，这里，组名为group1，而名称为job1。
        JobDetail job = newJob(QuartJob.class).withIdentity("job1", "group1").build();

        // 创建一个SimpleTrigger实例，指定该Trigger在Scheduler中所属组及名称。
        // 接着设置调度的时间规则.当前时间运行
        Trigger trigger = newTrigger().withIdentity("trigger1", "group12")
//                .withSchedule(simpleSchedule().withIntervalInSeconds(5).repeatForever())
                .withSchedule(cronSchedule("0/5 * * * * ?"))
                .startNow().build();

        // 注册并进行调度
        scheduler.scheduleJob(job, trigger);

        // 启动调度器
        scheduler.start();

        try {
            //当前线程等待65秒
            Thread.sleep(45L * 1000L);
        } catch (Exception e) {

        }

        //调度器停止运行
        scheduler.shutdown(true);

        System.out.println("结束运行。。。。");
    }
}
