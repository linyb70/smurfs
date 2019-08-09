package com.topideal.mybatis.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by weixiaolei on 2019/1/24.
 */
public class TimerTaskVo implements Serializable {
    //任务id
    private Long taskId;
    //属性说明
    private String taskName;
    //mq服务器IP
    private String serverIp;
    //生产组
    private String producerGroup;
    //端口
    private String serverPost;
    //主题
    private String topic;
    //标实
    private String tags;
    //时间类型  1 小时/次  2  月/次
    private String periodType;
    //下次执行时间
    private Timestamp nextTriggerDate;
    //时间间隔  如 4 小时
    private Integer intervalTime;
    //平台ID
    private Long platformId;
    //平台名称
    private String platformName;


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getServerPost() {
        return serverPost;
    }

    public void setServerPost(String serverPost) {
        this.serverPost = serverPost;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public Timestamp getNextTriggerDate() {
        return nextTriggerDate;
    }

    public void setNextTriggerDate(Timestamp nextTriggerDate) {
        this.nextTriggerDate = nextTriggerDate;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }


}
