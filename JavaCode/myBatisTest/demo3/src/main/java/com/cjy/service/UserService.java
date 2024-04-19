package com.cjy.service;

import com.cjy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/19 8:55
 * @Version 1.0
 * @Description:
 */
@Mapper
public interface UserService {
    @Select("select * from user")
    public List<User> getAll();
}
