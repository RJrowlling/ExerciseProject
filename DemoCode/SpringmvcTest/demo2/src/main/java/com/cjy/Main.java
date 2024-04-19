package com.cjy;

import com.cjy.config.SpringConfig;
import com.cjy.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/14 10:10
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
