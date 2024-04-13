package com.cjy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author cjy
 * @Date 2024/4/13 8:49
 * @Version 1.0
 * @Description:
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.cjy.dao.*Dao.*())")
    private void pt() {};

    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

//

    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }
}
