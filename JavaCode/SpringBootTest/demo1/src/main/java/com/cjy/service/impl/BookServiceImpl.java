package com.cjy.service.impl;

import com.cjy.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @Author cjy
 * @Date 2024/4/18 15:00
 * @Version 1.0
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running ...");
    }
}
