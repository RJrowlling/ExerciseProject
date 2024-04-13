package com.cjy;

import com.cjy.config.SpringConfig;
import com.cjy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/13 8:42
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        int a = bookDao.select();
//        System.out.println(a);
        bookDao.save();
    }
}