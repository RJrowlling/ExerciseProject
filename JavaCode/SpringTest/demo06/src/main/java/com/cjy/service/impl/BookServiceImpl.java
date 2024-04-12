package com.cjy.service.impl;

import com.cjy.dao.BookDao;
import com.cjy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author cjy
 * @Date 2024/4/12 10:44
 * @Version 1.0
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao1")
    private BookDao bookDao;

    @Value("${nick}")
    private String name;

    @Override
    public void save() {
        System.out.println("book service save ... " + name);
        bookDao.save();
    }
}
