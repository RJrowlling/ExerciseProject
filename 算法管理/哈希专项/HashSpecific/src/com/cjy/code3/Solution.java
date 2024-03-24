package com.cjy.code3;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数
 * 「快乐数」 定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 *
 * @Author cjy
 * @Date 2024/3/24 19:17
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    public int getNextNum(int num) {
        int result = 0;
        int temp;
        while (num != 0) {
            temp = num % 10;
            result += temp * temp;
            num /= 10;
        }
        return result;
    }
}
