package com.cjy.poly;

import com.sun.javaws.IconUtil;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("小明",5000);
        Manage manage = new Manage("陈总",10000,5000);

        Test test = new Test();
        test.showEmpAnnual(person);
        test.showEmpAnnual(manage);
        test.testWork(person);
        test.testWork(manage);
        
    }

//    向上转型
    public void showEmpAnnual(Employee e) {
        System.out.println("姓名为：" + e.name);
        System.out.println("工资为：" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Person) {
//            向下转型
            Person p = (Person)e;
            p.work();
        } else if (e instanceof Manage) {
            //            向下转型
            Manage m = (Manage)e;
            m.manage();
        } else {
            System.out.println("您的输入类型有误！");
        }

    }
}
