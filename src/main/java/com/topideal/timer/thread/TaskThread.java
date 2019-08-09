package com.topideal.timer.thread;

import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.mybatis.entity.TimerTaskVo;
import com.topideal.timer.service.TimerTaskService;
import com.topideal.timer.thread.bean.TimerTaskBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 多线程执行定时任务
 * Created by weixiaolei on 2019/1/24.
 */
@Component
public class TaskThread {

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    private TimerTaskService timerTaskService;

    public void execute(){
        //获取所有任务项
        List<TimerTaskVo> taskList=timerTaskService.searchTaskInfo(new TimerTaskModel());
        if(taskList!=null){
            for (TimerTaskVo timerTaskVo : taskList) {
                TimerTaskBean bean=new TimerTaskBean(timerTaskService,timerTaskVo);
                taskExecutor.execute(bean);
            }

        }
    }




}
