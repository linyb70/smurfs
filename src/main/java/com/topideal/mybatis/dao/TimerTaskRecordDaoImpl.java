package com.topideal.mybatis.dao;

import com.topideal.mybatis.dao.TimerTaskRecordDao;
import com.topideal.mybatis.entity.TimerTaskRecordModel;
import com.topideal.mybatis.mapper.TimerTaskRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weixiaolei on 2018/4/10.
 * @author lchenxing
 */
@Repository
public class TimerTaskRecordDaoImpl implements TimerTaskRecordDao {

    @Autowired
    private TimerTaskRecordMapper mapper;
	
	/**
	 * 列表查询
	 * @param model
	 */
	@Override
	public List<TimerTaskRecordModel> list(TimerTaskRecordModel model) throws SQLException {
		return mapper.list(model);
	}
	/**
	 * 新增
	 * @param model
	 */
    @Override
    public Long save(TimerTaskRecordModel model) throws SQLException {
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
    public int modify(TimerTaskRecordModel  model) throws SQLException {
        return mapper.update(model);
    }
    
    /**
     * 通过id查询实体类信息
     * @param id
     */
    @Override
    public TimerTaskRecordModel  searchById(Long id)throws SQLException {
        TimerTaskRecordModel  model=new TimerTaskRecordModel ();
        model.setId(id);
        return mapper.get(model);
    }
    
      /**
     	* 根据商家实体类查询商品
     	* @param model
     	* */
	@Override
	public TimerTaskRecordModel searchByModel(TimerTaskRecordModel model) throws SQLException {
		return mapper.get(model);
	}
    @Override
	public int del(Long id) throws SQLException {
		return mapper.del(id);
	}
}