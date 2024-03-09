/**
 * 1. 编写类 MyTools 类，编写一个方法可以打印二维数组的数据。
 * 2. 编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。克隆对象， 注意要求得到新对象和原来的
 *    对象是两个独立的对象，只是他们的属性相同
 * @author  cjy
 * @version  1.0
 */
public class MethodExercise02 {
	public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        MyTools tool = new MyTools();
        tool.printArrTwo(a);
	}
}

class MyTools {
    public void printArrTwo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

