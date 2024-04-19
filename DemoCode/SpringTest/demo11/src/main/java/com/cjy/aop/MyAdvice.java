package com.cjy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author cjy
 * @Date 2024/4/13 13:56
 * @Version 1.0
 * @Description:
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(boolean com.cjy.service.ResourceService.openURL(..))")
    private void servicePt() {};

    @Around("servicePt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof String) {
                args[i] = ((String) args[i]).trim();
            }
        }
        Object proceed = pjp.proceed(args);
        return proceed;
    }
}
