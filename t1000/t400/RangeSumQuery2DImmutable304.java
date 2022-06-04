package com.lemonade.leetcode.t1000.t400;

@SuppressWarnings("unused")
public class RangeSumQuery2DImmutable304 {

    static  class NumMatrix {

        int row;
        int col;

        int[][] dp;

        public NumMatrix(int[][] matrix) {
            dp = matrix;
            row = dp.length;
            col = dp[0].length;
            insertDp();
        }

        void insertDp(){
            for(int i = 1; i < row; i++){
                dp[i][0] = dp[i - 1][0] + dp[i][0];
            }

            for(int i = 1; i < col; i++){
                dp[0][i] = dp[0][i - 1] + dp[0][i];
            }

            for(int i = 1; i < row; i++){
                for(int j = 1; j < col; j++){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + dp[i][j];
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
