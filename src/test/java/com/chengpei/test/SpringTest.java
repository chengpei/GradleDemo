package com.chengpei.test;

import com.chengpei.quartz.QuartJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

import java.text.ParseException;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by chengpei on 2015/8/5.
 */
public class SpringTest {

    public static void main(String[] args) throws Exception {
        // 通过SchedulerFactory获取一个调度器实例
        SchedulerFactory sf = new StdSchedulerFactory();

        Scheduler scheduler = sf.getScheduler();

        TriggerKey triggerKey = new TriggerKey("trigger1", "group1");

        CronTriggerImpl trigger = (CronTriggerImpl) scheduler.getTrigger(triggerKey);

        trigger.setCronExpression("0/1 * * * * ?");

        // 注册并进行调度
        scheduler.rescheduleJob(triggerKey, trigger);
    }
}
