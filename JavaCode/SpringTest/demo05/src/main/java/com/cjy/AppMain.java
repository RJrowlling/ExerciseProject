package com.cjy;

import com.cjy.Dao.BookDao;
import com.cjy.config.SpringConfig;
import com.cjy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/12 9:46
 * @Version 1.0
 * @Description: 注解开发
 */
public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = ctx.getBean("bookDao",BookDao.class);
        BookDao bookDao2 = ctx.getBean("bookDao",BookDao.class);

        System.out.println(bookDao1);
        System.out.println(bookDao2);

        ctx.close();

    }
}