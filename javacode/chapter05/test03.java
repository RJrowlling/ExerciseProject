/**
 * 信用分为 100 分时，输出 信用极好；
 * 信用分为(80，99]时，输出 信用优秀；
 * 信用分为[60,80]时，输出 信用一般；
 * 其它情况 ，输出 信用 不及格
 * 请从键盘输入保国的芝麻信用分，并加以判断
-- * 
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的信用分：");
        int score = myScanner.nextInt();
        if (score == 100) {
            System.out.println("信用极好");
        } else if (score > 80 && score <= 99) {
            System.out.println("信用优秀");
        } else if (score > 60 && score <= 80) {
            System.out.println("信用一般");
        } else {
            System.out.println("信用不及格");
        }

	}
}