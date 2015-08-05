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
//        // ���������߹���
        SchedulerFactory sfc = new StdSchedulerFactory();
        // ͨ����������һ��������
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
