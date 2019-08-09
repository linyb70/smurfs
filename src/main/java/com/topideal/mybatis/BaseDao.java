package com.topideal.mybatis;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weixiaolei on 2018/4/10.
 */
public interface BaseDao<T> {
    /**
     * 新增
     * @param model  新增的参数
     * @return   自增长id
     * @throws SQLException
     */
     Long save(T model)throws SQLException;

    /**
     * 批量删除删除
     * @param ids  待删除id
     * @return   删除记录数
     * @throws SQLException
     */
     int batchDel(List ids)throws SQLException;

    /**
     * 删除   通过id
     * @param id
     * @return
     * @throws SQLException
     */
     int del(Long id)throws SQLException;

    /**
     *  修改
     * @param model  修改的实体类参数
     * @return  修改的记录数
     * @throws SQLException
     */
     int modify(T model)throws SQLException;


    /**
     * 通过id查询实体类信息
     * @param id
     * @return
     */
     T searchById(Long id)throws SQLException;

    /**
     * 条件查询所有记录
     * @return
     */
    List<T> list(T model)throws SQLException;

    /**
     * 通过实体查询实体类信息
     * @param model
     * @return
     */
     T searchByModel(T model)throws SQLException;
     

}
