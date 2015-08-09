package com.chengpei.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chengpei on 2015/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring/spring-servlet.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class SpringTestContext {

    protected final Log logger = LogFactory.getLog(getClass());

}
