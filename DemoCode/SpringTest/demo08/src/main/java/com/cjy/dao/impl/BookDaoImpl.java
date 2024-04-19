package com.cjy.dao.impl;

import com.cjy.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author cjy
 * @Date 2024/4/13 8:43
 * @Version 1.0
 * @Description:
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {

        System.out.println("book dao save ...");
//        int a = 100 / 0;
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }

    @Override
    public int select() {
        System.out.println("book dao select ...");
        return 100;
    }
}
