/**
有三个方法，分别实现返回姓名和两门课成绩(总分)，返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分)。
封装成一个可变参数的方法
 * @author  cjy
 * @version  1.0
 */
public class VarParameterExercise {
	public static void main(String[] args) {
        HspMethod a = new HspMethod();
        a.showScore("陈俊宇",99,87);
        a.showScore("aaa",99,87,76);
        a.showScore("ddd",99,87,76,96,67);
	}
}

class HspMethod {
    public void showScore(String name, double... score) {
        System.out.println("您的姓名为：" + name);
        System.out.println("您的成绩为：");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}