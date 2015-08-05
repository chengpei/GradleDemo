package com.chengpei.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

import java.text.ParseException;

import static org.quartz.JobBuilder.newJob;

/**
 * Created by chengpei on 2015/8/5.
 */
public class QuartzDemo {

    public static void main(String[] args) throws SchedulerException, ParseException, ClassNotFoundException {
//        // 创建调度者工厂
        SchedulerFactory sfc = new StdSchedulerFactory();
        // 通过工厂创建一个调度者
        Scheduler scheduler = sfc.getScheduler();
        TriggerKey triggerKey = new TriggerKey("TRIGGERCODE","JOBCODE");
        CronTriggerImpl cti = (CronTriggerImpl) scheduler.getTrigger(triggerKey);
        JobKey jobKey = new JobKey("JOBCODE", "JOBGROUPCODE");
        JobDetail myJob = scheduler.getJobDetail(jobKey);
        if(cti == null){
            cti = new CronTriggerImpl();
            cti.setJobKey(jobKey);
            cti.setKey(triggerKey);
            cti.setCronExpression("0/10 * * * * ?");
            if(myJob == null){
                Class<Job> jobImpl = (Class<Job>) Class.forName("com.chengpei.quartz.QuartJob");
                myJob = newJob(jobImpl).withIdentity(jobKey).build();
                scheduler.scheduleJob(myJob, cti);
            }else{
                scheduler.scheduleJob(cti);
            }
        }
    }
}
