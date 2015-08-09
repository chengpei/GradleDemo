package com.chengpei.dao.mapper;

import com.chengpei.model.JobInfo;

import java.util.List;
import java.util.Map;

public interface JobInfoMapper {
    int deleteByPrimaryKey(Byte jobId);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Byte jobId);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);

    List<JobInfo> selectJobInfoByCondition(Map<String, Object> condition);
}