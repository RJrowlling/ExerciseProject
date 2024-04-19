package com.cjy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author cjy
 * @Date 2024/4/13 10:38
 * @Version 1.0
 * @Description:
 */
@Component
@Aspect
public class Advice {
    @Pointcut("execution(* com.cjy.service.*Service.save(..))")
    private void pt() {
    }

    ;

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        Class declaringType = signature.getDeclaringType();
        String name = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.println(declaringType+"运行时间：" + (end - start) + "ms" + "：" + name);
    }
}
