import java.util.Scanner;

/**
 * 使用快捷键的开发项目
 * 使用 IDEA 开发一个 java 项目 testpro01，创建一个类 MyTools, 编写一个方法，可以完成对 int 数组冒泡排序的功能
 *
 * @author cjy
 * @version 1.0
 */

public class MyTools {
    public static void main(String[] args) {
        System.out.println("Hello,world");
        System.out.println("Hello,world");
        System.out.println("Hello,world");
        System.out.println("Hello,world");


        Scanner scanner = new Scanner(System.in);

        int[] testArr = {23, 45, 12, 80, 73};
        Bubble bubble = new Bubble();
        bubble.bubbleSort(testArr);
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + " ");
        }


    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class Bubble {
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


