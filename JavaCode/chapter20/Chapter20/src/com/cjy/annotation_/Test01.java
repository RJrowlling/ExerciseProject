package com.cjy.annotation_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author cjy
 * @version 1.0
 */
public class Test01 {
    //显示定义值 / 不显示值就是默认值
    @MyAnnotation(name="陈俊宇",age=23,id=1,schools = {"湖北大学"})
    public void test() {

    }

    //只有一个参数, 默认名字一般是value.使用可省略不写
    @MyAnnotation2("aaa")
    public void test2() {

    }

}

@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name() default "";
    int age() default 0;
    int id() default -1; //String indexOf("abc") -1 , 不存在,找不到
    String[] schools() default {"清华大学"};
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    String[] value();
}
