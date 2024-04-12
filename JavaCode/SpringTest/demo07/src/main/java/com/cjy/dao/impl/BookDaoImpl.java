package com.cjy.dao.impl;

import com.cjy.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author cjy
 * @Date 2024/4/11 9:42
 * @Version 1.0
 * @Description:
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
