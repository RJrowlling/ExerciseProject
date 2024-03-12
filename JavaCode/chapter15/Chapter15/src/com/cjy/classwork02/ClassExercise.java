package com.cjy.classwork02;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author cjy
 * @version 1.0
 */
public class ClassExercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("陈俊宇",3000,new MyDate(2024,3,12)));
        employees.add(new Employee("小明",4000,new MyDate(2023,11,12)));
        employees.add(new Employee("小红",5000,new MyDate(2022,7,8)));
        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (true) {
                    int e1Year = e1.getBirthday().getYear();
                    int e2Year = e2.getBirthday().getYear();
                    int e1Month = e1.getBirthday().getMonth();
                    int e2Month = e2.getBirthday().getMonth();
                    int e1Day = e1.getBirthday().getDay();
                    int e2Day = e2.getBirthday().getDay();

                    int i = e1Year - e2Year;
                    if (i!=0) {
                        return i;
                    }
                    int m = e1Month - e2Month;
                    if (m!=0) {
                        return m;
                    }
                    int d = e1Day - e2Day;
                    if (d!=0) {
                        return d;
                    }
                    return 0;


//                    if (e1Year == e2Year) {
//                        if (e1Month == e2Month) {
//                            return e1Day - e2Day;
//                        }
//                    }
                }


                return 0;
            }
        });
        System.out.println(employees);
    }
}

