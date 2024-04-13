package com.cjy.service.impl;

import com.cjy.dao.BookDao;
import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * @Author cjy
 * @Date 2024/4/11 9:44
 * @Version 1.0
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private DataSource dataSource;

    @Override
    public void save() {
        int i = bookDao.randomInt();
        System.out.println(dataSource);
        System.out.println(i);
    }
}
