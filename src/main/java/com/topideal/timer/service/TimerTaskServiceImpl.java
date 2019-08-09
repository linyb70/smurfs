package com.topideal.timer.service;

import com.topideal.mybatis.dao.TimerTaskDao;
import com.topideal.mybatis.dao.TimerTaskRecordDao;
import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.mybatis.entity.TimerTaskRecordModel;
import com.topideal.mybatis.entity.TimerTaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Timer;

/**
 * Created by weixiaolei on 2019/1/24.
 */
@Service
public class TimerTaskServiceImpl implements TimerTaskService {

    @Autowired
    private TimerTaskDao timerTaskDao;

    @Autowired
    private TimerTaskRecordDao timerTaskRecordDao;

    @Override
    public List<TimerTaskVo> searchTaskInfo(TimerTaskModel model) {
        List<TimerTaskVo> timerTaskList=timerTaskDao.searchTaskInfo(model);
        return timerTaskList;
    }

    @Override
    public int modifyNextTime(TimerTaskModel model) throws SQLException {
        return timerTaskDao.modify(model);
    }

    @Override
    public void saveTaskRecord(TimerTaskVo timerTaskVo, String status,String errorMessage) throws SQLException {
        TimerTaskRecordModel model=new TimerTaskRecordModel();
        model.setTaskId(timerTaskVo.getTaskId());
        model.setTaskName(timerTaskVo.getTaskName());
        model.setPlatformId(timerTaskVo.getPlatformId());
        model.setPlatformName(timerTaskVo.getPlatformName());
        model.setPeriodType(timerTaskVo.getPeriodType());
        model.setIntervalTime(timerTaskVo.getIntervalTime());
        model.setTriggerDate(timerTaskVo.getNextTriggerDate());
        model.setStatus(status);
        model.setErrorMessage(errorMessage);
        timerTaskRecordDao.save(model);
    }
}
