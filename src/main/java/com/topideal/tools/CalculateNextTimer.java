package com.topideal.tools;

import com.topideal.mybatis.entity.TimerTaskModel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

/**
 * 计算下一个时点
 * Created by weixiaolei on 2019/1/24.
 */
public class CalculateNextTimer {

    private static volatile CalculateNextTimer calculateNextTimer=null;

    private CalculateNextTimer(){

    }

    public static CalculateNextTimer getInstance() {
        if (calculateNextTimer == null) {
            synchronized(CalculateNextTimer.class) {
                if (calculateNextTimer == null) {
                    calculateNextTimer = new CalculateNextTimer();
                }
            }
        }
        return calculateNextTimer;
    }

    /**
     * 计算下一个时点
     * @return
     */
    public Timestamp calculate(Timestamp nextTriggerDate,String periodType,Integer intervalTime){
        //格式化
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nextTriggerDate);
        if("1".equals(periodType)){
            calendar.add(Calendar.MINUTE,intervalTime);
        }else if("2".equals(periodType)){
            calendar.add(Calendar.HOUR,intervalTime);
        }else{
            calendar.add(Calendar.MONTH,intervalTime);
        }
        return Timestamp.valueOf(format.format(calendar.getTime()));
    }

    public static void main(String[] args){
        //Timestamp nextTriggerDate=CalculateNextTimer.getInstance().calculate(new Timestamp(System.currentTimeMillis()),"1",24);
         //System.out.println(nextTriggerDate);

        TimerTaskModel model=new TimerTaskModel();
        model.setId(null);
        model.setTaskName("");
        Optional optional=
                Optional.ofNullable(model).filter(u->u.getId()==null);
      //Optional.ofNullable(model).filter(u->"".equals(u.getTaskName())).ifPresent(()-);

    }








}
