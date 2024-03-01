/**
 * 1.请使用递归的方式求出斐波那契数1,1,2.3.5,8,13...给你一个整数n，求出它的值是多少
 * 2.猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，然后再多吃一个。
 *   当到第10天时，想再吃时(即还没吃)发现只有1个桃子了。问题:最初共多少个桃子?
 * @author  cjy
 * @version  1.0
 */
public class RecursionExercise01 {
	public static void main(String[] args) {
        CC a = new CC();
        System.out.println(a.f(6));

        
        System.out.println(a.p(1));
        
	}
}

class CC {
    public int p(int day) {
        // p(10) = 1;
        // p(9) = 4;
        // p(8) = 10;
        // p(day) = (p(day + 1) + 1) * 2
        if (day == 10) {
            return 1;
        } else {
            return (p(day + 1) + 1) * 2;
        }
    }

    public int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}