package com.lemonade.leetcode.t1000.t400;

public class RangeSumQuery2DImmutable304 {

    public static void main(String[] args) {
        int[][] in = new int[5][5];
        //[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]

        in[0] = new int[]{3, 0, 1, 4, 2};
        in[1] = new int[]{5, 6, 3, 2, 1};
        in[2] = new int[]{1, 2, 0, 1, 5};
        in[3] = new int[]{4, 1, 0, 1, 7};
        in[4] = new int[]{1, 0, 3, 0, 5};

        new NumMatrix(in).sumRegion(2,1,4,3);

    }
    static  class NumMatrix {

        int row;
        int col;
        int[][] mat;

        int[][] dp;

        public NumMatrix(int[][] matrix) {
            mat = matrix;
            row = mat.length;
            col = mat[0].length;
            dp = new int[row][col];

            insertDp();
        }

        void insertDp(){
            dp[0][0] = mat[0][0];
            for(int i = 1; i < row; i++){
                dp[i][0] = dp[i - 1][0] + mat[i][0];
            }

            for(int i = 1; i < col; i++){
                dp[0][i] = dp[0][i - 1] + mat[0][i];
            }

            for(int i = 1; i < row; i++){
                for(int j = 1; j < col; j++){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + mat[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int res = dp[row2][col2];

            if(row1 != 0){
                res -= dp[row1 - 1][col2];
            }

            if(col1 != 0){
                res -= dp[row2][col1 - 1];
            }

            if(row1 != 0 && col1 != 0){
                res += dp[row1 - 1][col1 - 1];
            }

            return res;
        }
    }

}
