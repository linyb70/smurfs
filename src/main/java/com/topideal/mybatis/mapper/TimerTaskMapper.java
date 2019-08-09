package com.topideal.mybatis.mapper;

import com.topideal.mybatis.BaseMapper;
import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.mybatis.entity.TimerTaskVo;

import java.util.List;

public interface TimerTaskMapper extends BaseMapper<TimerTaskModel> {


    List<TimerTaskVo> searchTaskInfo(TimerTaskModel model);



}
