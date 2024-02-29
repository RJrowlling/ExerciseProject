/**
 * 使用二维数组打印一个 10 行杨辉三角
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
 * @author  cjy
 * @version  1.0
 */
public class YangHui {
	public static void main(String[] args) {
        int a[][] = new int[10][];

        for (int i = 0; i < 10; i++) {
            a[i] = new int[i+1];

            a[i][0] = 1;
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
            a[i][i] = 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
	}
}