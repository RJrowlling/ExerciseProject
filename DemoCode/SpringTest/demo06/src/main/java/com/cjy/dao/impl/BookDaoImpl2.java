package com.cjy.dao.impl;

import com.cjy.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author cjy
 * @Date 2024/4/12 10:57
 * @Version 1.0
 * @Description:
 */
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...bookDao2" );
    }
}
