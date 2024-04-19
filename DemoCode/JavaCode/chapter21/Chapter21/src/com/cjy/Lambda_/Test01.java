package com.cjy.Lambda_;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/**
 * @author cjy
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("执行")).start();

        int i = calculateNum((left, right) -> left + right);
        System.out.println(i);

        printNum(value -> value > 5);

        Integer integer = typeConver((s) -> Integer.valueOf(s));
        System.out.println(integer);
    }

    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public static <R> R typeConver(Function<String,R> function){
        String str = "1235";
        R result = function.apply(str);
        return result;
    }
}
