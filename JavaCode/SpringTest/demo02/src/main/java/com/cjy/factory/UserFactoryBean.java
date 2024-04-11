package com.cjy.factory;

import com.cjy.dao.BookDao;
import com.cjy.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author cjy
 * @Date 2024/4/11 10:56
 * @Version 1.0
 * @Description:
 */
public class UserFactoryBean implements FactoryBean<BookDao> {

    @Override
    public BookDao getObject() throws Exception {
        System.out.println("hello");
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }
}
