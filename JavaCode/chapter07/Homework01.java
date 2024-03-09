/**
1. 编写类A01，定义方法max，实现求某个double数组的最大值，并返回
2. 编写类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引如果找不到,返回-1
3. 编写类Book,定义方法updatePrice，实现更改某本书的价格，具体:
   如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
4. 编写类A03,实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
5. 定义一个圆类Circle，定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法
6. 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)
   并创建两个对象，分别测试
7. 设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。并创建对象，进行测试.
 * @author  cjy
 * @version  1.0
 */
public class Homework01 {
	public static void main(String[] args) {
        // 编写类A01，定义方法max，实现求某个double数组的最大值，并返回
        double[] a = {10.2, 8.7, 2.2, 6.7};
        A01 a01 = new A01();
        System.out.println(a01.max(a));
        System.out.println("_____________________");
        
        // 编写类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引如果找不到,返回-1
        String[] b = {"adsa", "dvdgfs", "wewqe", "1231das"};
        A02 a02 = new A02();
        System.out.println(a02.find(b, "dvdgfs"));
        System.out.println("_____________________");

        double[] bookarr = {173.3,120,100,90.0,65.3};
        Book bb = new Book();
        bb.updatePrice(bookarr);
        for (int i = 0; i < bookarr.length; i++) {
            System.out.print(bookarr[i]+" ");
        }
        System.out.println("\n_____________________");

        int[] a3 = {1,2,3,4,5,6};
        A03 a03 = new A03();
        int[] a33 = a03.copyArr(a3);
        for (int i = 0; i < a33.length; i++) {
            System.out.print(a33[i]+" ");
        }
        System.out.println("\n_____________________");

        Circle c1 = new Circle();
        c1.r = 10;
        c1.showLength();
        c1.showArea();
        System.out.println("\n_____________________");

        Dog d1 = new Dog("大黄","黄色",4);
        d1.show();
        System.out.println("\n_____________________");

        
    }
}

class A01 {
    public double max(double[] arr) {
        double maxTemp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxTemp < arr[i]) {
                maxTemp = arr[i];
            }
        }
        return maxTemp;
    }
}

class A02 {
    public int find(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}

class Book {
    public void updatePrice(double[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] > 150) {
                books[i] = 150;
            } else if (books[i] > 100) {
                books[i] = 100;
            } else {
                continue;
            }
        }
    }
}

class A03 {
    public int[] copyArr(int[] arr) {
        int[] copyarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyarr[i] = arr[i];
        }
        return copyarr;
    }
}

class Circle {
    double r;

    public void showLength() {
        System.out.println("圆的周长为：" + 2*r*3.14);
    }
     public void showArea() {
        System.out.println("圆的面积为：" + r*r*3.14);
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.age);
    }
}