package com.cjy;

import com.cjy.config.SpringConfig;
import com.cjy.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/13 13:46
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://pan.baidu.com/haha", "root   ");
        System.out.println(flag);
    }
}