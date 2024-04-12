package com.cjy;

import com.cjy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @Author cjy
 * @Date 2024/4/12 8:27
 * @Version 1.0
 * @Description: 管理第三方bean
 */
public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\cjy\\Desktop\\ExerciseProject\\JavaCode\\SpringTest\\demo04\\src\\main\\resources\\applicationContext.xml");


//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource);

//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);

        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();

    }
}