/**
 * 编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁, 
 * 否则输出 "你年龄大于 18,要对自己的行为负责,送入监狱"
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
        } else {
            System.out.println("你的年龄不大这次放过你了");
        }

	}
}