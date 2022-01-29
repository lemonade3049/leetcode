package com.lemonade.leetcode.t1000.t100;

public class SearchA2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int r = 0;
        int c = col - 1;

        while (r < row && c >= 0) {
            if (matrix[r][c] > target) {
                c--;
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                return true;
            }
        }

        return false;
    }
}
