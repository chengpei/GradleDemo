package com.chengpei.service;

import com.chengpei.dao.MessageBoardDAO;
import com.chengpei.dao.mapper.MessageBoardMapper;
import com.chengpei.model.MessageBoard;
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

    @Autowired
    private MessageBoardDAO messageBoardDAO;

    public Integer saveMessageBoard(MessageBoard messageBoard) {
        return messageBoardMapper.insertSelective(messageBoard);
    }

    public List<MessageBoard> selectMessageBoardByAcceptPerson(int acceptPerson) {
        return messageBoardDAO.selectMessageBoardByAcceptPerson(acceptPerson,0,5);
    }
}
