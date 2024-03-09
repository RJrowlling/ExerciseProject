/**

 * @author  cjy
 * @version  1.0
 */
public class OverLoadExc {
	public static void main(String[] args) {
        Methods a = new Methods();
        System.out.println(a.max(10,20));
        System.out.println(a.max(5.5,3.7));
        System.out.println(a.max(5.5,3.7,10.7));
	}
}


// 在Methods类，定义三个重载方法max()，，，,并分别调用三个方法。
class Methods {
    public int max(int a, int b) {
        System.out.println("第一个方法，返回两个int值中的最大值:");
        return a >= b ? a : b;
    }
    public double max(double a,double b) {
        System.out.println("第二个方法，返回两个double值中的最大值:");
        return a >= b ? a : b;
    }
     public double max(double a,double b, double c) {
        System.out.println("第三个方法，返回三个double值中的最大值:");
        double temp = a >= b ? a : b;
        return temp >= c ? temp : c;
    }
}