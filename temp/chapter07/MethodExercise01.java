/**
 * 1. 编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
 * 2. 根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果
 * @author  cjy
 * @version  1.0
 */
public class MethodExercise01 {
	public static void main(String[] args) {
        AA a = new AA();
        System.out.println(a.odd(3));
        a.printChar(3,4);
	}
}

class AA {
    public boolean odd(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printChar(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}