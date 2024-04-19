package com.cjy.dao.impl;

import com.cjy.dao.BookDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Random;

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
        System.out.println("save........");;
    }

    @Override
    public int randomInt() {
        int i = (int) (Math.random() * 1000);
        return i;
    }
}
