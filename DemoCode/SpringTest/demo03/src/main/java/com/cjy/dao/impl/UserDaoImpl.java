package com.cjy.dao.impl;

import com.cjy.dao.UserDao;

/**
 * @Author cjy
 * @Date 2024/4/11 11:43
 * @Version 1.0
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user do save...");
    }
}
