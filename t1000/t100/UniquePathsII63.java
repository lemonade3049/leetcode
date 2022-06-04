package com.lemonade.leetcode.t1000.t100;

public class UniquePathsII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int x = obstacleGrid.length;
        int y = obstacleGrid[0].length;
        int[][] dp = new int[x][y];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[x - 1][y - 1] == 1) {
            return 0;
        }
        dp[0][0] = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[x - 1][y - 1];
    }
}
