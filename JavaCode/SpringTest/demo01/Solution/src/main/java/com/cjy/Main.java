package com.cjy;

import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.service.impl.BookServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/11 9:32
 * @Version 1.0
 * @Description: IoC、DI入门案例
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        BookDaoImpl bookDao = (BookDaoImpl) ctx.getBean("bookDao");
//        bookDao.save();

        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookService");
        bookService.save();
    }
}