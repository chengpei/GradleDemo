package com.chengpei.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by chengpei on 2015/7/27.
 */
@Controller
@RequestMapping("/messageboard")
public class MessageBoardController {
    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value = "/loadMessageBoard", method = RequestMethod.GET)
    public String toMessageBoard(){
        return "/messageBoard";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(HttpSession session, HttpServletRequest request){
        String editorValue = request.getParameter("editorValue");
        if(editorValue != null){
            List<Map<String, Object>> rows = (List<Map<String, Object>>) session.getAttribute("rows");
            if(rows == null){
                rows = new ArrayList<Map<String, Object>>();
            }
            Map<String, Object> map = new LinkedHashMap<String, Object>();
            map.put("TIME",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            map.put("CONTENT", request.getParameter("editorValue"));
            rows.add(map);
            logger.debug("±à¼­Æ÷Ìá½»ÄÚÈÝ£º" + request.getParameter("editorValue"));
            session.setAttribute("rows",rows);
        }
        return "redirect:/messageboard/loadMessageBoard";
    }
}
