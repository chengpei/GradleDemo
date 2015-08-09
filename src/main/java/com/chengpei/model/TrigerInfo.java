package com.chengpei.model;

import java.util.Date;

public class TrigerInfo {
    private Integer trigerId;

    private String trigerName;

    private String trigerCode;

    private String trigerGroup;

    private String cronExpression;

    private Integer jobId;

    private String status;

    private Date createTime;

    public Integer getTrigerId() {
        return trigerId;
    }

    public void setTrigerId(Integer trigerId) {
        this.trigerId = trigerId;
    }

    public String getTrigerName() {
        return trigerName;
    }

    public void setTrigerName(String trigerName) {
        this.trigerName = trigerName == null ? null : trigerName.trim();
    }

    public String getTrigerCode() {
        return trigerCode;
    }

    public void setTrigerCode(String trigerCode) {
        this.trigerCode = trigerCode == null ? null : trigerCode.trim();
    }

    public String getTrigerGroup() {
        return trigerGroup;
    }

    public void setTrigerGroup(String trigerGroup) {
        this.trigerGroup = trigerGroup == null ? null : trigerGroup.trim();
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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

    @Override
    public String toString() {
        return "TrigerInfo{" +
                "trigerId=" + trigerId +
                ", trigerName='" + trigerName + '\'' +
                ", trigerCode='" + trigerCode + '\'' +
                ", trigerGroup='" + trigerGroup + '\'' +
                ", cronExpression='" + cronExpression + '\'' +
                ", jobId=" + jobId +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}