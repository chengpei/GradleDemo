package com.chengpei.controller;

import com.chengpei.model.MessageBoard;
import com.chengpei.service.MessageBoardService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by chengpei on 2015/7/27.
 */
@Controller
@RequestMapping("/messageboard")
public class MessageBoardController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private MessageBoardService messageBoardService;

    @RequestMapping(value = "/loadMessageBoard", method = RequestMethod.GET)
    public ModelAndView toMessageBoard(){
        List<MessageBoard> messageBoardList = messageBoardService.selectMessageBoardByAcceptPerson(1);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/messageBoard");
        modelAndView.addObject("messageBoardList", messageBoardList);
        return modelAndView;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(HttpServletRequest request) throws Exception {
//        InputStreamReader isr = new InputStreamReader(request.getInputStream());
//        StringBuilder body = new StringBuilder();
//        char[] bt = new char[100];
//        while (isr.read(bt,0,bt.length) != -1){
//            body.append(bt);
//        }
//        logger.debug("submit() --> RequestBody = " + body.toString());
//        isr.close();
        if(!StringUtils.isEmpty(request.getParameter("editorValue"))){
            MessageBoard messageBoard = new MessageBoard();
            messageBoard.setContent(request.getParameter("editorValue"));
            messageBoard.setAcceptPerson(1);
            messageBoard.setCreatePerson(1);
            messageBoard.setCreateTime(new Date());
            logger.debug("submit() --> messageBoard = " + messageBoard);
            messageBoardService.saveMessageBoard(messageBoard);
        }
        return "redirect:/messageboard/loadMessageBoard";
    }
}
