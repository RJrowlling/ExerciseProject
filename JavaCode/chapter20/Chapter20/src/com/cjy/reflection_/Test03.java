package com.cjy.reflection_;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author cjy
 * @version 1.0
 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Class userClass = Class.forName("com.cjy.reflection_.User");
        //调用缺省构造函数，返回Class对象的一个实例
        User user = (User)userClass.newInstance();
        System.out.println(user);

        //返回此Class对象所表示的实体的名称
        String name = userClass.getName();
        System.out.println(name);

        //返回当前Class对象的父类的class对象
        Class superclass = userClass.getSuperclass();
        System.out.println(superclass);

        //获取当前Class对象的接口
        Class[] interfaces = userClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        //返回该类的类加载器
        ClassLoader classLoader = userClass.getClassLoader();
        System.out.println(classLoader);

        //返回一个包含默写Constructor对象的数组
        Constructor[] constructors = userClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //返回一个Method对象，此对象的形参类型为paramType
        Method setId = userClass.getMethod("setId", Integer.TYPE);
        System.out.println(setId);

        //返回Field对象的一个数组（Declared说明就算是private属性，也可以获取）
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //返回Field对象的一个数组（没有Declared，那就只能获取public的属性）
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}

class User implements Serializable {
    private int id;
    private String name;
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void sayHello() {
        System.out.println("hello,world");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
