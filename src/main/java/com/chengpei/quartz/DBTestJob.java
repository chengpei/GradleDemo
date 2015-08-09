package com.chengpei.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chengpei on 2015/8/9.
 */
public class DBTestJob implements Job{
    protected final Log logger = LogFactory.getLog(getClass());

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.debug("*********************************************************************************************************************");
        logger.debug("*********************************************************************************************************************");
        logger.debug("****************************  QuartJob定时任务execute()启动 "+sdf.format(new Date())+" *************************************");
        logger.debug("*********************************************************************************************************************");
        logger.debug("*********************************************************************************************************************");
    }
}
