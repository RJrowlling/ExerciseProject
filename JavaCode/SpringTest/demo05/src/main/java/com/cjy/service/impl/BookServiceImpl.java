package com.cjy.service.impl;

import com.cjy.Dao.BookDao;
import com.cjy.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author cjy
 * @Date 2024/4/11 9:44
 * @Version 1.0
 * @Description:
 */
@Service
//@Component
public class BookServiceImpl implements BookService {


    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
