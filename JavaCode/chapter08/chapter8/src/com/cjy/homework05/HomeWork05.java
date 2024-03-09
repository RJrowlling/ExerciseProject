package com.cjy.homework05;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("小明",1000);
        Peasant peasant = new Peasant("小强",1000);
        Teacher teacher = new Teacher("小红",1000,10);
        Scientist scientist = new Scientist("小光",1000);

        Test test = new Test();
        test.printAnnulSalary(worker);
        test.printAnnulSalary(peasant);
        test.printAnnulSalary(teacher);
        test.printAnnulSalary(scientist);
    }
}

class Test{
    public void printAnnulSalary(Person person) {
        person.printAnnulSalary();
    }
}
