package com.topideal.mybatis.entity;
import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TimerTaskRecordModel implements Serializable{

     //属性说明
     private String periodType;
     //属性说明
     private Timestamp triggerDate;
     //属性说明
     private String taskName;
     //属性说明
     private Long id;
     //属性说明
     private Long platformId;
     //属性说明
     private String platformName;
     //属性说明
     private Long taskId;
     //属性说明
     private Integer intervalTime;
     //属性说明
     private String status;
     //属性说明
     private Timestamp createDate;

    private String errorMessage;

    /*periodType get 方法 */
    public String getPeriodType(){
        return periodType;
    }
    /*periodType set 方法 */
    public void setPeriodType(String  periodType){
        this.periodType=periodType;
    }
    /*triggerDate get 方法 */
    public Timestamp getTriggerDate(){
        return triggerDate;
    }
    /*triggerDate set 方法 */
    public void setTriggerDate(Timestamp  triggerDate){
        this.triggerDate=triggerDate;
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
    /*platformId get 方法 */
    public Long getPlatformId(){
        return platformId;
    }
    /*platformId set 方法 */
    public void setPlatformId(Long  platformId){
        this.platformId=platformId;
    }
    /*platformName get 方法 */
    public String getPlatformName(){
        return platformName;
    }
    /*platformName set 方法 */
    public void setPlatformName(String  platformName){
        this.platformName=platformName;
    }
    /*taskId get 方法 */
    public Long getTaskId(){
        return taskId;
    }
    /*taskId set 方法 */
    public void setTaskId(Long  taskId){
        this.taskId=taskId;
    }
    /*intervalTime get 方法 */
    public Integer getIntervalTime(){
        return intervalTime;
    }
    /*intervalTime set 方法 */
    public void setIntervalTime(Integer  intervalTime){
        this.intervalTime=intervalTime;
    }
    /*status get 方法 */
    public String getStatus(){
        return status;
    }
    /*status set 方法 */
    public void setStatus(String  status){
        this.status=status;
    }
    /*createDate get 方法 */
    public Timestamp getCreateDate(){
        return createDate;
    }
    /*createDate set 方法 */
    public void setCreateDate(Timestamp  createDate){
        this.createDate=createDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
