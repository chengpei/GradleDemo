package com.chengpei.dao.mapper;

import com.chengpei.model.TrigerInfo;

public interface TrigerInfoMapper {
    int deleteByPrimaryKey(Integer trigerId);

    int insert(TrigerInfo record);

    int insertSelective(TrigerInfo record);

    TrigerInfo selectByPrimaryKey(Integer trigerId);

    int updateByPrimaryKeySelective(TrigerInfo record);

    int updateByPrimaryKey(TrigerInfo record);
}