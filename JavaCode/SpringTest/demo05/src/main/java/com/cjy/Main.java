package com.cjy;

import com.cjy.Dao.BookDao;
import com.cjy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/12 9:46
 * @Version 1.0
 * @Description: 注解开发
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
        bookDao.save();
        System.out.println("______________________________");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}