package com.chengpei.util;

import com.chengpei.dao.mapper.JobInfoMapper;
import com.chengpei.dao.mapper.TrigerInfoMapper;
import com.chengpei.model.JobInfo;
import com.chengpei.model.TrigerInfo;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by chengpei on 2015/8/8.
 */
@Repository
public class JobManager {

    private SchedulerFactory schedulerFactory;

    private Scheduler scheduler;

    @Resource
    private JobInfoMapper jobInfoMapper;

    @Resource
    private TrigerInfoMapper trigerInfoMapper;

    public JobManager() throws Exception {
        schedulerFactory = new StdSchedulerFactory();
        scheduler = schedulerFactory.getScheduler();
    }

    /**
     * 初始化所有job
     * @return
     */
    public List<JobInfo> initAllJob() throws Exception {
        List<JobInfo> jobInfoList = jobInfoMapper.selectJobInfoByCondition(null);
        Map<JobDetail, Set<? extends Trigger>> triggersAndJobs = new HashMap<>();
        for(JobInfo jobInfo : jobInfoList){
            Class<Job> jobClass = (Class<Job>) Class.forName(jobInfo.getJobClass());
            //创建Job
            JobDetail job = JobBuilder.newJob(jobClass)
                    .withIdentity(jobInfo.getJobCode(), jobInfo.getJobGroup())
                    .build();
            Set<Trigger> triggers = new HashSet<>();
            for(TrigerInfo trigerInfo : jobInfo.getTrigerInfoList()){
                //创建触发器
                Trigger trigger = TriggerBuilder.newTrigger()
                        .withIdentity(trigerInfo.getTrigerCode(), trigerInfo.getTrigerGroup())
                        .withSchedule(CronScheduleBuilder.cronSchedule(trigerInfo.getCronExpression()))
                        .startNow()
                        .build();
                triggers.add(trigger);
            }
            triggersAndJobs.put(job, triggers);
        }
        scheduler.scheduleJobs(triggersAndJobs, false);
        scheduler.start();
        return jobInfoList;
    }

    /**
     * 开启定时任务
     */
    public void startTriger(Integer trigerId) throws Exception {
        TrigerInfo trigerInfo = trigerInfoMapper.selectByPrimaryKey(trigerId);
        TriggerKey triggerKey = new TriggerKey(trigerInfo.getTrigerCode(), trigerInfo.getTrigerGroup());
        CronTriggerImpl cronTrigger = (CronTriggerImpl) scheduler.getTrigger(triggerKey);
        cronTrigger.setCronExpression(trigerInfo.getCronExpression());
        scheduler.rescheduleJob(triggerKey, cronTrigger);
    }

    /**
     * 暂停定时任务
     * @throws Exception
     */
    public void pauseTriger(Integer trigerId) throws Exception {
        TrigerInfo trigerInfo = trigerInfoMapper.selectByPrimaryKey(trigerId);
        TriggerKey triggerKey = new TriggerKey(trigerInfo.getTrigerCode(), trigerInfo.getTrigerGroup());
        scheduler.pauseTrigger(triggerKey);
    }

    /**
     * 更新触发器cron
     * @param trigerId
     * @param cronExpreeion
     * @return
     */
//    public void updateTrigerCronExpression(Integer trigerId, String cronExpreeion) throws Exception {
//        TrigerInfo trigerInfo = trigerInfoMapper.selectByPrimaryKey(trigerId);
//        //更新定时任务
//        TriggerKey triggerKey = new TriggerKey(trigerInfo.getTrigerCode(), trigerInfo.getTrigerGroup());
//        CronTriggerImpl cronTrigger = (CronTriggerImpl) scheduler.getTrigger(triggerKey);
//        cronTrigger.setCronExpression(cronExpreeion);
//        scheduler.rescheduleJob(triggerKey, cronTrigger);
//    }
}
