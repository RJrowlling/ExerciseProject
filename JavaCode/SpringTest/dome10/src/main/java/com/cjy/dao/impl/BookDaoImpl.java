package com.cjy.dao.impl;

import com.cjy.dao.BookDao;
import org.springframework.stereotype.Repository;

import java.nio.file.attribute.BasicFileAttributes;

/**
 * @Author cjy
 * @Date 2024/4/13 13:12
 * @Version 1.0
 * @Description:
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id,String name) {
        System.out.println("id:"+id);
        if (true) throw new NullPointerException();
        return "cjy666";
    }
}
