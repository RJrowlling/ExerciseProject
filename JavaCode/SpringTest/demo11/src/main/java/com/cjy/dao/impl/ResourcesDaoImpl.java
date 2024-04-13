package com.cjy.dao.impl;

import com.cjy.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

/**
 * @Author cjy
 * @Date 2024/4/13 13:50
 * @Version 1.0
 * @Description:
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        //模拟校验
        return password.equals("root");
    }
}
