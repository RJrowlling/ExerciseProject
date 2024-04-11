package com.cjy;


import com.cjy.dao.impl.BookDaoImpl;
import com.cjy.service.impl.BookServiceImpl;
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

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        BookDaoImpl bookDao = (BookDaoImpl) ctx.getBean("bookDao");
//        bookDao.save();

//        BookServiceImpl bookService1 = (BookServiceImpl) ctx.getBean("service");
//        BookServiceImpl bookService2 = (BookServiceImpl) ctx.getBean("service");
//        System.out.println(bookService1);
//        System.out.println(bookService2);

//        BookDaoImpl dao = (BookDaoImpl) ctx.getBean("dao");
//        dao.save();

//        BookDaoImpl dao1 = (BookDaoImpl) ctx.getBean("dao1");
//        dao1.save();
        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookService");
        ctx.registerShutdownHook();
        bookService.save();
    }
}