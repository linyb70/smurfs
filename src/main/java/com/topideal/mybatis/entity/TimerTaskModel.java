package com.topideal.mybatis.entity;
import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TimerTaskModel implements Serializable{

     //属性说明
     private Long platformId;
     //属性说明
     private Long mqId;
     //属性说明
     private Timestamp nextTriggerDate;
     //属性说明
     private String tags;
     //属性说明
     private Timestamp firstTriggerDate;
     //属性说明
     private String periodType;
     //属性说明
     private Long creater;
     //属性说明
     private String topic;
     //属性说明
     private String taskName;
     //属性说明
     private Long id;
     //属性说明
     private String platformName;
     //属性说明
     private Integer intervalTime;
     //属性说明
     private Timestamp createDate;

    /*platformId get 方法 */
    public Long getPlatformId(){
        return platformId;
    }
    /*platformId set 方法 */
    public void setPlatformId(Long  platformId){
        this.platformId=platformId;
    }
    /*mqId get 方法 */
    public Long getMqId(){
        return mqId;
    }
    /*mqId set 方法 */
    public void setMqId(Long  mqId){
        this.mqId=mqId;
    }
    /*nextTriggerDate get 方法 */
    public Timestamp getNextTriggerDate(){
        return nextTriggerDate;
    }
    /*nextTriggerDate set 方法 */
    public void setNextTriggerDate(Timestamp  nextTriggerDate){
        this.nextTriggerDate=nextTriggerDate;
    }
    /*tags get 方法 */
    public String getTags(){
        return tags;
    }
    /*tags set 方法 */
    public void setTags(String  tags){
        this.tags=tags;
    }
    /*firstTriggerDate get 方法 */
    public Timestamp getFirstTriggerDate(){
        return firstTriggerDate;
    }
    /*firstTriggerDate set 方法 */
    public void setFirstTriggerDate(Timestamp  firstTriggerDate){
        this.firstTriggerDate=firstTriggerDate;
    }
    /*periodType get 方法 */
    public String getPeriodType(){
        return periodType;
    }
    /*periodType set 方法 */
    public void setPeriodType(String  periodType){
        this.periodType=periodType;
    }
    /*creater get 方法 */
    public Long getCreater(){
        return creater;
    }
    /*creater set 方法 */
    public void setCreater(Long  creater){
        this.creater=creater;
    }
    /*topic get 方法 */
    public String getTopic(){
        return topic;
    }
    /*topic set 方法 */
    public void setTopic(String  topic){
        this.topic=topic;
    }
    /*taskName get 方法 */
    public String getTaskName(){
        return taskName;
    }
    /*taskName set 方法 */
    public void setTaskName(String  taskName){
        this.taskName=taskName;
    }
    /*id get 方法 */
    public Long getId(){
        return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
        this.id=id;
    }
    /*platformName get 方法 */
    public String getPlatformName(){
        return platformName;
    }
    /*platformName set 方法 */
    public void setPlatformName(String  platformName){
        this.platformName=platformName;
    }
    /*intervalTime get 方法 */
    public Integer getIntervalTime(){
        return intervalTime;
    }
    /*intervalTime set 方法 */
    public void setIntervalTime(Integer  intervalTime){
        this.intervalTime=intervalTime;
    }
    /*createDate get 方法 */
    public Timestamp getCreateDate(){
        return createDate;
    }
    /*createDate set 方法 */
    public void setCreateDate(Timestamp  createDate){
        this.createDate=createDate;
    }






}
