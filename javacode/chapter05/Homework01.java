/**
 * 
 * @author  cjy
 * @version  1.0
 */
public class Homework01 {
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;
		while(true) {
			System.out.println(money);
			if (money > 50000) {
				money = money * 0.95;
				count++;
			} else if (money <= 50000) {
				money -= 1000;
				count++;
			}
			if (money < 1000) {
				System.out.println(count);
				break;
			}
		}

	}
}