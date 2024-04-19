package com.cjy.service;

import com.cjy.domain.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/19 10:57
 * @Version 1.0
 * @Description:
 */
@Mapper
public interface EmpService {

    public List<Emp> getAll();
}
