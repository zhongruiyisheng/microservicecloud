package com.wanke.springcloud.dao;

import com.wanke.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface DeptDao {

    /**
     * 新增部门表数据
     * @param dept 部门
     * @return boolean
     */
    public boolean addDept(Dept dept);

    /**
     * 通过部门Id查询部门
     * @param id 部门主键ID
     * @return Dept
     */
    public Dept findById(Long id);

    /**
     * 查询全部部门信息
     * @return List<Dept>
     */
    public List<Dept> findAll();
}
