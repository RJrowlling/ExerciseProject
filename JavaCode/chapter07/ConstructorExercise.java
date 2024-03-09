/**
第一个无参构造器:利用构造器设置所有人的age属性初始值都为18

第二个带pName和 pAge 两个参数的构造器:使得每次创建 Person对象的同时初始化对象的age属性值和 name属性值。分别使用不同的构造器，创建对象.
代码:

 * @author  cjy
 * @version  1.0
 */
public class ConstructorExercise {
	public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("chenjunyu", 19);
        p1.show();
        p2.show();
	}
}

class Person {
    String name;
    int age;

    public Person() {
        System.out.println("第一个无参构造器:利用构造器设置所有人的age属性初始值都为18");
        age = 18;
    }
    public Person(String pName, int Page) {
         System.out.println("第二个带pName和 pAge 两个参数的构造器");
        name = pName;
        age = Page;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}