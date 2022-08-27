package com.lemonade.leetcode.t1000.t400;

public class MaxSumOfRectangleNoLargerThanK363 {
    public static void main(String[] args) {

        int[][] arr = {{5,-4,-3,4},{-3,-4,4,5},{5,1,5,-4}};
        System.out.println(new MaxSumOfRectangleNoLargerThanK363().maxSumSubmatrix(arr, 8));
    }
    public int maxSumSubmatrix(int[][] matrix, int k) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[m][n];
        temp[0][0] = matrix[0][0];

        for (int i = 1; i < m; i++) {
            temp[i][0] = temp[i - 1][0] + matrix[i][0];
        }

        for (int i = 1; i < n; i++) {
            temp[0][i] = temp[0][i - 1] + matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1] - temp[i - 1][j - 1] + matrix[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l <= i; l++) {
                    for (int o = 0; o <= j; o++) {
                        int rtn = check(temp, i, j, l, o);
                        if (rtn <= k && rtn > max) {
                            max = rtn;
                        }
                    }
                }
            }
        }
        return max;
    }

    private int check(int[][] temp, int i, int j, int l, int o) {
        if (l == 0 && o == 0) {
            return temp[i][j];
        }
        if (l == 0) {
            return temp[i][j] - temp[i][o - 1];
        }
        if (o == 0) {
            return temp[i][j] - temp[l - 1][j];
        }

        return temp[i][j] - temp[l - 1][j] - temp[i][o - 1] + temp[l - 1][o - 1];
    }
}
