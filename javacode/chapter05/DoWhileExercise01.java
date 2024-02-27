/**
 * 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class DoWhileExercise01 {
	public static void main(String[] args) {
        int i = 1;
        int count = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                count++;
            }
            i++;
        } while(i <= 200);
        System.out.println(count);

	}
}