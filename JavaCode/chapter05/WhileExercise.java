/**
 * 打印 40—200 之间所有的偶数
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class WhileExercise {
	public static void main(String[] args) {
        int i = 40;
        while (i <= 200) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;

        }


	}
}