package com.cjy.reflection_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author cjy
 * @version 1.0
 */
public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> userClass = Class.forName("com.cjy.reflection_.User");

        User user = new User(1,"陈俊宇",22);


        //直接用user.getName的形式调用方法1亿次（2ms）
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "ms");

        //用类对象获取指定方法后，激活这个方法执行1亿次（104ms）
        Method getName = userClass.getMethod("getName");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "ms");

        //用类对象获取指定方法后，在激活之前调用setAccessible禁用安全检查机关，然后激活这个方法执行1亿次（60ms）
        startTime = System.currentTimeMillis();
        getName.setAccessible(true);
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "ms");




    }
}
