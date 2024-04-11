package com.cjy;

import com.cjy.service.impl.AutoServiceImpl;
import com.cjy.service.impl.BookServiceImpl;
import com.cjy.service.impl.CollectionServiceImpl;
import com.cjy.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/11 11:39
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookService");
//        bookService.save();

//        UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userService");
//        userService.save();

//        AutoServiceImpl autoService = (AutoServiceImpl) ctx.getBean("autoService");
//        autoService.save();

        CollectionServiceImpl collectionService = (CollectionServiceImpl) ctx.getBean("collectionService");
        collectionService.save();
    }

}