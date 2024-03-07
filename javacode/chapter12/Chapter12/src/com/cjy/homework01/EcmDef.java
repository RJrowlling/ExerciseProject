package com.cjy.homework01;

/**
 * @author cjy
 * @version 1.0
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            cal(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        }
        catch (NumberFormatException e) {
            System.out.println("你没有输入数字");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你没有输入两个参数");
        }
        catch (ArithmeticException e) {
            System.out.println("你的被除数为零");
        }
    }

    static void cal (int n1, int n2) {
        System.out.println(n1 / n2);
    }
}
