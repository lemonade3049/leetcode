package com.lemonade.leetcode.t1000.t100;

public class SetMatrixZeroes73 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        new SetMatrixZeroes73().setZeroes(arr);
    }

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int t = matrix[0][0];
        boolean rowFlg = false;
        boolean colFlg = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        rowFlg = true;
                    }
                    if (j == 0) {
                        colFlg = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < col; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        if (t == 0) {
            for (int j = 0; j < row; j++) {
                matrix[j][0] = 0;
            }
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        } else {
            if (rowFlg) {
                for (int j = 0; j < col; j++) {
                    matrix[0][j] = 0;
                }
            }
            if (colFlg) {
                for (int j = 0; j < row; j++) {
                    matrix[j][0] = 0;
                }
            }
        }
    }
}
