package com.chengpei.dao.mapper;

import com.chengpei.model.JobInfo;

import java.util.Map;
import java.util.Objects;

public interface JobInfoMapper {
    int deleteByPrimaryKey(Byte jobId);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Byte jobId);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);

    JobInfo selectJobInfoByCondition(Map<String, Objects> condition);
}