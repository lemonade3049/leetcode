package com.lemonade.leetcode.t1000.t100;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>(m * n);
        for (int i = 0, j = 0; i < (m + 1) / 2 && j < (n + 1) / 2; i++, j++) {
            f(matrix, list, i, j, m - i - 1, n - j - 1);
        }
        return list;
    }

    private void f(int[][] matrix, List<Integer> list, int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            list.add(matrix[x1][y1]);
        } else if (x1 == x2) {
            for (int i = y1; i <= y2; i++) {
                list.add(matrix[x1][i]);
            }
        } else if (y1 == y2) {
            for (int i = x1; i <= x2; i++) {
                list.add(matrix[i][y1]);
            }
        } else {
            for (int i = y1; i <= y2; i++) {
                list.add(matrix[x1][i]);
            }
            for (int i = x1 + 1; i <= x2; i++) {
                list.add(matrix[i][y2]);
            }
            for (int i = y2 - 1; i >= y1; i--) {
                list.add(matrix[x2][i]);
            }
            for (int i = x2 - 1; i > x1; i--) {
                list.add(matrix[i][y1]);
            }
        }
    }
}
