package com.cjy.homework03;

import java.io.*;
import java.util.Properties;

/**
 * @author cjy
 * @version 1.0
 */
public class HomeWork3 {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.setProperty("name","tom");
//        properties.setProperty("age","5");
//        properties.setProperty("color","red");
//        properties.store(new FileWriter("E:\\mytemp\\dog.properties"),null);
        Dog dog = new Dog("小白",2,"白色");
        Properties properties = new Properties();
        properties.load(new FileReader("E:\\mytemp\\dog.properties"));
        properties.list(System.out);

        FileOutputStream fileOutputStream = new FileOutputStream("E:\\mytemp\\dog.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
    }
}

class Dog implements Serializable{
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
