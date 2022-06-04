package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class RotateImage48 {

    public void rotate(int[][] matrix) {
        int x = 0;
        int y = matrix.length - 1;
        int n = matrix.length - 1;
        while (x < y) {
            f(matrix, x, y, n);
            x++;
            y--;
        }
    }

    private void f(int[][] matrix, int x, int y, int n) {
        for (int i = x; i < y; i++) {
            g(matrix, x, i, n);
        }
    }

    private void g(int[][] matrix, int x, int y, int n) {
        int t = matrix[n - y][x];
        matrix[n - y][x] = matrix[n - x][n - y];
        matrix[n - x][n - y] = matrix[y][n - x];
        matrix[y][n - x] = matrix[x][y];
        matrix[x][y] = t;
    }
}
