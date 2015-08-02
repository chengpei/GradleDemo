package com.chengpei.service;

import com.chengpei.dao.mapper.MessageBoardMapper;
import com.chengpei.model.MessageBoard;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chengpei on 2015/8/1.
 */
@Service
public class MessageBoardService {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private MessageBoardMapper messageBoardMapper;

    public Integer saveMessageBoard(MessageBoard messageBoard) {
        return messageBoardMapper.insertSelective(messageBoard);
    }

    public List<MessageBoard> selectMessageBoardByAcceptPerson(int acceptPerson) {
        PageHelper.startPage(1,5);
        Page page = (Page) messageBoardMapper.selectMessageBoardByAcceptPerson(acceptPerson);
        logger.debug("MessageBoardService.selectMessageBoardByAcceptPerson() -----> " + page);
        return page;
    }
}
