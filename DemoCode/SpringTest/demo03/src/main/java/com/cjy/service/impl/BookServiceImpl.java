package com.cjy.service.impl;

import com.cjy.dao.BookDao;
import com.cjy.dao.UserDao;
import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.service.BookService;

/**
 * @Author cjy
 * @Date 2024/4/11 9:44
 * @Version 1.0
 * @Description:
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;
    private int connectionNum;
    private String DataBaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ..." + DataBaseName + "："+ connectionNum);
        bookDao.save();
        userDao.save();
    }
}
