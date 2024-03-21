package com.cjy.reflection_;

/**
 * @author cjy
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        System.out.println("这个人是:"+person.name);

        //获得class办法一:通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1);

        //获得class办法二:通过类的静态成员class获得
        Class c2 = Person.class;
        System.out.println(c2);

        //获得class办法三:通过字符串获得(包名+类名)
        Class c3 = Class.forName("com.cjy.reflection_.Student");
        System.out.println(c3);

        //获得class办法四:只针对内置的基本数据类型
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获得父类类型
        Class c5 = c3.getSuperclass();
        System.out.println(c5);

    }
}

class Person {
    public String name;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}
