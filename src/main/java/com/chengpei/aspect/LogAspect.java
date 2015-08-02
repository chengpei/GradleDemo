package com.chengpei.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by chengpei on 2015/8/1.
 */
@Component("logAspect")
//@Aspect
public class LogAspect {
    protected final Log logger = LogFactory.getLog(getClass());

//    @Before("execution(* com.chengpei.controller.*.*(..))")
    public void begin(){
        logger.debug("切点之前~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

//    @After("execution(* com.chengpei.controller.*.*(..))")
    public void after(){
        logger.debug("切点之后~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

//    @Around("execution(* com.chengpei.controller.*.*(..))")
    public void around(){
        logger.debug("环绕切点************************************************");
    }
}
