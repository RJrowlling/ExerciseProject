package com.cjy.service.impl;

import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.dao.impl.UserDaoImpl;
import com.cjy.service.UserService;

/**
 * @Author cjy
 * @Date 2024/4/11 14:40
 * @Version 1.0
 * @Description: 构造器注入
 */
public class UserServiceImpl implements UserService {
    private BookDaoImpl bookDao;
    private UserDaoImpl userDao;
    private int connectionNum;
    private String DataBaseName;

    public UserServiceImpl(BookDaoImpl bookDao, UserDaoImpl userDao, int connectionNum, String dataBaseName) {
        this.bookDao = bookDao;
        this.userDao = userDao;
        this.connectionNum = connectionNum;
        DataBaseName = dataBaseName;
    }

    @Override
    public void save() {
        System.out.println("UserService running ....." + DataBaseName + "： "+ connectionNum);
        bookDao.save();
        userDao.save();
    }
}
