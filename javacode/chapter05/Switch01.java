/**
 * 请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
 * a 表示星期一，b 表示星期二 
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-g：");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            default:
                System.out.println("您输入的不正确");
        }

	}
}