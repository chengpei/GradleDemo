package com.chengpei.model;

import java.util.Date;
import java.util.List;

public class JobInfo {
    private Byte jobId;

    private String jobName;

    private String jobCode;

    private String jobGroup;

    private String jobClass;

    private String status;

    private Date createTime;

    private List<TrigerInfo> trigerInfoList;

    public Byte getJobId() {
        return jobId;
    }

    public void setJobId(Byte jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass == null ? null : jobClass.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<TrigerInfo> getTrigerInfoList() {
        return trigerInfoList;
    }

    public void setTrigerInfoList(List<TrigerInfo> trigerInfoList) {
        this.trigerInfoList = trigerInfoList;
    }

    @Override
    public String toString() {
        return "JobInfo{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", jobGroup='" + jobGroup + '\'' +
                ", jobClass='" + jobClass + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}