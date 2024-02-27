/**
 * 计算表达式
 * 被除数是小数取余时，套用公式a % b = a - a / b * b
 * @author  cjy
 * @version  1.0
 */
public class Homework01 {
	public static void main(String[] args) {
		System.out.println(10 / 3);//3

		System.out.println(10 / 5);//2

		System.out.println(10 % 2);//0

		System.out.println(-10.5 % 3);//-10.5 - (-10.5 / 3) * 3 = -1.5

	}
}