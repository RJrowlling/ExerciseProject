/**
 * 打印出金字塔。
 * @author  cjy
 * @version  1.0
 */
import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_____________________");

        for (int i = 1; i <= 6; i++) {
            for (int z = 1; z <= (6 - i); z++) {
                    System.out.print(" ");
                }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_____________________");

        for (int i = 1; i <= 6; i++) {
            for (int z = 1; z <= (6 - i); z++) {
                    System.out.print(" ");
                }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 6) {
                    System.out.print("*");
                    continue;
                }
                
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }

	}
}