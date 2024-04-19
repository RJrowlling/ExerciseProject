/**
 * 打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.[化繁为简,先死后活
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class ForExercise {
	public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1;  i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println(count);
        System.out.println(sum);

	}
}