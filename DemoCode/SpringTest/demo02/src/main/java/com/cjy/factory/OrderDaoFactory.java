package com.cjy.factory;

import com.cjy.dao.BookDao;
import com.cjy.dao.impl.BookDaoImpl;

/**
 * @Author cjy
 * @Date 2024/4/11 10:43
 * @Version 1.0
 * @Description:
 */
public class OrderDaoFactory {
    public static BookDao bookDao() {
        return new BookDaoImpl();
    }
}
