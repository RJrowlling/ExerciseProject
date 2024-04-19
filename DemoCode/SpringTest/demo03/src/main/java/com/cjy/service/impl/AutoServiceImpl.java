package com.cjy.service.impl;

import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.dao.impl.UserDaoImpl;
import com.cjy.service.AutoService;

/**
 * @Author cjy
 * @Date 2024/4/11 14:57
 * @Version 1.0
 * @Description: 自动注入
 */
public class AutoServiceImpl implements AutoService {
    private BookDaoImpl bookDao;
    private UserDaoImpl userDao;
    @Override
    public void save() {
        System.out.println("AutoService running....");
        bookDao.save();
        userDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
