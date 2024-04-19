package com.cjy;

import com.cjy.config.SpringConfig;
import com.cjy.dao.BookDao;
import com.cjy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @Author cjy
 * @Date 2024/4/12 10:40
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);


//        System.out.println("_________________________");
//        BookService bookService = ctx.getBean(BookService.class);
//        bookService.save();

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);



    }
}