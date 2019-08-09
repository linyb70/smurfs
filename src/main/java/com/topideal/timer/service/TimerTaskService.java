package com.topideal.timer.service;

import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.mybatis.entity.TimerTaskVo;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weixiaolei on 2019/1/24.
 */
public interface TimerTaskService {


    List<TimerTaskVo> searchTaskInfo(TimerTaskModel model);

    /**
     * 修改下一次触发时点
     * @param model
     * @return
     */
    int modifyNextTime(TimerTaskModel model)throws SQLException;

    /**
     * 保存任务记录
     * @param timerTaskVo
     * @param status
     * @throws SQLException
     */
    void saveTaskRecord(TimerTaskVo timerTaskVo,String status,String errorMessage)throws SQLException;


}
