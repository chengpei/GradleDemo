package com.chengpei.test;

import com.chengpei.model.JobInfo;
import com.chengpei.util.JobManager;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class SpringTest extends SpringTestContext{

    @Resource
    private JobManager jobManager;

    @Test
    public void test() throws Exception {
        List<JobInfo> jobInfos = jobManager.initAllJob();
        Assert.assertNotNull(jobInfos);
        Thread.sleep(15 * 1000);
        jobManager.pauseTriger(1);
        logger.debug("===============触发器暂停================");
        Thread.sleep(10 * 1000);
        jobManager.startTriger(1);
        Thread.sleep(60 * 1000);
    }
}
