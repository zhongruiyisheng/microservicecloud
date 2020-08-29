package com.wanke.springcloud.service;

import com.wanke.springcloud.entity.Dept;

import java.util.List;

/**
 * @author hewanke
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
