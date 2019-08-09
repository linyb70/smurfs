package com.topideal.mybatis.dao;

import com.topideal.mybatis.BaseDao;
import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.mybatis.entity.TimerTaskVo;

import java.util.List;


public interface TimerTaskDao extends BaseDao<TimerTaskModel> {

    List<TimerTaskVo> searchTaskInfo(TimerTaskModel model);
		










}
