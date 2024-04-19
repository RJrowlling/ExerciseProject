package com.cjy.reflectANDannotation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.annotation.*;

/**
 * @author cjy
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> studentClass = Class.forName("com.cjy.reflectANDannotation.Student");

        //获得这个类的注解
        Annotation[] annotations = studentClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得类的注解value的值
        Table annotation = studentClass.getAnnotation(Table.class);
        System.out.println(annotation.tableName());

        //获得类指定注解的值
        java.lang.reflect.Field name = studentClass.getDeclaredField("id");
        Field nameAnnotation = name.getAnnotation(Field.class);
        System.out.println(nameAnnotation.column());
        System.out.println(nameAnnotation.type());
        System.out.println(nameAnnotation.length());
    }
}

@Table(tableName = "学生表")
class Student {
    @Field(column = "id",type = "int",length = 3)
    private int id;

    @Field(column = "姓名",type = "varchar",length = 10)
    private String name;

    @Field(column = "年龄",type = "int",length = 3)
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String tableName();//表名
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Field {
    String column();//列名
    String type();//类型
    int length();//长度
}

