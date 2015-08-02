package com.chengpei.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chengpei on 2015/7/28.
 */
@Controller
public class IndexController {
    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        logger.debug("--------------------------进入主页-----------------------------");
        return "index";
    }
}
