package com.cjy.service.impl;

import com.cjy.dao.BookDao;
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

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
