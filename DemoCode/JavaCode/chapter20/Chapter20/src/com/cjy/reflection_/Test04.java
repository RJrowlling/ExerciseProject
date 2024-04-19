package com.cjy.reflection_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author cjy
 * @version 1.0
 */
public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> userClass = Class.forName("com.cjy.reflection_.User");
        User user = (User)userClass.newInstance();
        System.out.println(user);

        //调用有形参的方法
        Method setName = userClass.getMethod("setName", String.class);
        setName.invoke(user,"陈俊宇");
        System.out.println(user);

        //调用没有形参的方法
        Method getName = userClass.getMethod("getName");
        System.out.println(getName.invoke(user));

        //调用静态方法
        Method sayHello = userClass.getMethod("sayHello");
        sayHello.invoke(null);


    }
}
