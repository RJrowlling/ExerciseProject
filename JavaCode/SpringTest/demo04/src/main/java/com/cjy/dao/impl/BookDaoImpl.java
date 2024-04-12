package com.cjy.dao.impl;

import com.cjy.dao.BookDao;

/**
 * @Author cjy
 * @Date 2024/4/12 9:01
 * @Version 1.0
 * @Description:
 */
public class BookDaoImpl implements BookDao {
    private String jdbc;
    @Override
    public void save() {
        System.out.println("save....." + jdbc);
    }

    public void setJdbc(String jdbc) {
        this.jdbc = jdbc;
    }
}
