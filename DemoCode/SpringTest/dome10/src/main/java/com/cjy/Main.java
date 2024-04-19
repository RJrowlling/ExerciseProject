package com.cjy;

import com.cjy.config.SpringConfig;
import com.cjy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/13 13:11
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.findName(888,"hhh");
    }
}