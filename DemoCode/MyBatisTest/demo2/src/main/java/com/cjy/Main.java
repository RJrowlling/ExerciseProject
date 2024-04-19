package com.cjy;

import com.cjy.config.SpringConfig;
import com.cjy.domain.Account;
import com.cjy.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author cjy
 * @Date 2024/4/16 11:47
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac = accountService.findById(2);
        System.out.println(ac);
    }
}