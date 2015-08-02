package com.chengpei.dao;

import com.chengpei.model.MessageBoard;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chengpei on 2015/8/2.
 */
@Repository
public class MessageBoardDAO extends SqlSessionDaoSupport {

    public List<MessageBoard> selectMessageBoardByAcceptPerson(int acceptPerson, int offset, int limit) {
        return getSqlSession().selectList("com.chengpei.dao.mapper.MessageBoardMapper.selectMessageBoardByAcceptPerson",acceptPerson,new RowBounds(offset,limit));
    }
}
