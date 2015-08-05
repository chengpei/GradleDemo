package com.chengpei.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by chengpei on 2015/8/5.
 */
public class QuartJob implements Job{
    protected final Log logger = LogFactory.getLog(getClass());
    
    public void doJob(){
        logger.debug("********************************************************************************************");
        logger.debug("********************************************************************************************");
        logger.debug("*******************************  QuartJob��ʱ����ִ��  *************************************");
        logger.debug("********************************************************************************************");
        logger.debug("********************************************************************************************");
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.debug("********************************************************************************************");
        logger.debug("********************************************************************************************");
        logger.debug("*******************************  QuartJob��ʱ����ִ��  *************************************");
        logger.debug("********************************************************************************************");
        logger.debug("********************************************************************************************");
    }
}
