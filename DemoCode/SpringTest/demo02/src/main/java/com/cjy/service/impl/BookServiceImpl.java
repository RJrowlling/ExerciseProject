package com.cjy.service.impl;

import com.cjy.dao.BookDao;
import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author cjy
 * @Date 2024/4/11 9:44
 * @Version 1.0
 * @Description:
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy.....");
    }
}
