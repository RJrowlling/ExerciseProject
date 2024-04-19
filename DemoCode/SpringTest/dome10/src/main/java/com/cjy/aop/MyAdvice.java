package com.cjy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author cjy
 * @Date 2024/4/13 13:14
 * @Version 1.0
 * @Description:
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.cjy.dao.BookDao.findName(..))")
    private void pt() {};

//    @Before("pt()")
//    public void before(JoinPoint jp) {
//        Object[] args = jp.getArgs();
//        System.out.println(Arrays.toString(args));
//        System.out.println("before advice ..." );
//    }

//    @After("pt()")
//    public void after() {
//        System.out.println("after advice ...");
//    }
//
//    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp){
//        Object[] args = pjp.getArgs();
//        System.out.println(Arrays.toString(args));
//        args[0] = 99999;
//
//        Object ret = null;
//        try {
//            ret = pjp.proceed(args);
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(ret);
//        return ret;
//    }
//    @AfterReturning(value = "pt()", returning = "ret")
//    public void afterReturning(Object ret) {
//        System.out.println("afterReturning advice ..." + ret);
//    }
//
//
    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..." + t);
    }
}
