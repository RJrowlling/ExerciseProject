package com.cjy.Dao.impl;

import com.cjy.Dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author cjy
 * @Date 2024/4/12 9:48
 * @Version 1.0
 * @Description:
 */
//@Component("bookDao")
@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ..." );
    }
    @PostConstruct
    public void init() {
        System.out.println("init .....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy .....");
    }
}
