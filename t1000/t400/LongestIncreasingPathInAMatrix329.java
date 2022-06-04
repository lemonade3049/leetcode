package com.lemonade.leetcode.t1000.t400;

import java.lang.annotation.Native;

public class LongestIncreasingPathInAMatrix329 {

    public static void main(String[] args) {
        System.out.println(new LongestIncreasingPathInAMatrix329().longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2
                , 6}, {2, 2, 1}}));
    }

    public int longestIncreasingPath(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (res[i][j] != 0) {
                    continue;
                }
                f(matrix, res, i, j);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(res[i][j], max);
            }
        }
        return max;
    }

    private int f(int[][] matrix, int[][] res, int i, int j) {
        if (res[i][j] != 0) {
            return res[i][j];
        }

        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            res[i][j] = Math.max(f(matrix, res, i - 1, j), res[i][j]);
        }
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            res[i][j] = Math.max(f(matrix, res, i, j - 1), res[i][j]);
        }
        if (i < matrix.length - 1 && matrix[i + 1][j] > matrix[i][j]) {
            res[i][j] = Math.max(f(matrix, res, i + 1, j), res[i][j]);
        }
        if (j < matrix[0].length - 1 && matrix[i][j + 1] > matrix[i][j]) {
            res[i][j] = Math.max(f(matrix, res, i, j + 1), res[i][j]);
        }
        res[i][j]++;
        return res[i][j];
    }
}
