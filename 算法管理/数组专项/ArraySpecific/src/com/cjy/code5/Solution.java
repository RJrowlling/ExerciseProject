package com.cjy.code5;

import org.junit.jupiter.api.Test;

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix
 * @author cjy
 * @version 1.0
 */
public class Solution {
    //模拟题
    public int[][]  generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int count = 1;

        int circle = n / 2;
        while(circle-- > 0) {
            for (int j = startY; j < n - offset; j++) {
                matrix[startX][j] = count++;
            }
            for (int i = startX; i < n - offset; i++) {
                matrix[i][n - offset] = count++;
            }
            for (int j = n - offset; j > startY; j--) {
                matrix[n - offset][j] = count++;
            }
            for (int i = n - offset; i > startX; i--) {
                matrix[i][startY] = count++;
            }
            startX++;
            startY++;
            offset++;
        }
        if(n % 2 == 1) {
            matrix[n/2][n/2] = n * n;
        }
        return matrix;
    }
    @Test
    public void test() {
        int[][] matrix = generateMatrix(6);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

