/**
 * 编写程序，声明 2 个 double 型变量并赋值。判断第一个数大于 10.0，且第 2 个数小于 20.0，打印两数之和。
 * 
 * 定义两个变量 int，判断二者的和，是否能被 3 又能被 5 整除，打印提示信息
 * 
 * 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被 4 整除，但不能被 100 整除；(2)能被 400整除
 * 
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
        double a = 11.2;
        double b = 12.2;
        if (a > 10.0 && b < 20.0) {
            System.out.println("a + b = " + (a + b));
        }

        int c = 10;
        int d = 20;
        if ((((c + d) % 3) == 0) && ((c + d) % 5) == 0) {
            System.out.println(c + " 和 " + d + " 的和，既能被3整除，也能被5整除");
        }

        int year = 2000;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }

	}
}