package com.topideal.mybatis.dao;

import com.topideal.mybatis.dao.TimerTaskDao;
import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.mybatis.entity.TimerTaskVo;
import com.topideal.mybatis.mapper.TimerTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weixiaolei on 2018/4/10.
 * @author lchenxing
 */
@Repository
public class TimerTaskDaoImpl implements TimerTaskDao {

    @Autowired
    private TimerTaskMapper mapper;
	
	/**
	 * 列表查询
	 * @param model
	 */
	@Override
	public List<TimerTaskModel> list(TimerTaskModel model) throws SQLException {
		return mapper.list(model);
	}
	/**
	 * 新增
	 * @param model
	 */
    @Override
    public Long save(TimerTaskModel model) throws SQLException {
        int num=mapper.insert(model);
        if(num==1){
            return model.getId();
        }
        return null;
    }
    
	/**
     * 删除
     * @param ids
     */
    @Override
    public int batchDel(List ids) throws SQLException {
        return mapper.batchDel(ids);
    }
    
	/**
     * 修改
     * @param model
     */
    @Override
    public int modify(TimerTaskModel  model) throws SQLException {
        return mapper.update(model);
    }
    
    /**
     * 通过id查询实体类信息
     * @param id
     */
    @Override
    public TimerTaskModel  searchById(Long id)throws SQLException {
        TimerTaskModel  model=new TimerTaskModel ();
        model.setId(id);
        return mapper.get(model);
    }
    
      /**
     	* 根据商家实体类查询商品
     	* @param model
     	* */
	@Override
	public TimerTaskModel searchByModel(TimerTaskModel model) throws SQLException {
		return mapper.get(model);
	}
    @Override
	public int del(Long id) throws SQLException {
		return mapper.del(id);
	}

    /**
     * 自定义方法
     * @param model
     * @return
     */
    @Override
    public List<TimerTaskVo> searchTaskInfo(TimerTaskModel model) {
        return mapper.searchTaskInfo(model);
    }
}