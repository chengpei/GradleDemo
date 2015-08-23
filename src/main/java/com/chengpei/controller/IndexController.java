package com.chengpei.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chengpei on 2015/7/28.
 */
@Controller
public class IndexController {
    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView index(){
        logger.debug("--------------------------进入主页-----------------------------");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "chengpp");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "webpage", method = RequestMethod.GET)
    public ModelAndView webpage(){
        logger.debug("--------------------------进入主页-----------------------------");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "chengpp");
        modelAndView.setViewName("webpage");
        return modelAndView;
    }
}
