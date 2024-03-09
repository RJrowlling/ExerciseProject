/**
 * 冒泡排序
 * 把大的排到最后面去(化繁为简)
 * @author  cjy
 * @version  1.0
 */
public class BubbleSort {
	public static void main(String[] args) {
        int a[] = {24, 69, 80, 57, 13};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
	}
}