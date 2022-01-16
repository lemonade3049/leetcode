package com.lemonade.leetcode.t2000;

public class NumberOfClosedIslands1254 {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dp[i][0] != -1) {
                f(dp, i, 0, n, m);
            }
            if (dp[i][m - 1] != -1) {
                f(dp, i, m - 1, n, m);
            }
        }

        for (int i = 0; i < m; i++) {
            if (dp[0][i] != -1) {
                f(dp, 0, i, n, m);
            }
            if (dp[n - 1][i] != -1) {
                f(dp, n - 1, i, n, m);
            }


        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] != -1) {
                    f(dp, i, j, n, m);
                    res++;
                }
            }
        }
        return res;

    }

    void f(int[][] dp, int i, int j, int n, int m) {
        if (dp[i][j] == -1) {
            return;
        }

        dp[i][j] = -1;
        if (i != 0 && dp[i - 1][j] != -1) {
            f(dp, i - 1, j, n, m);
        }
        if (i != n - 1 && dp[i + 1][j] != -1) {
            f(dp, i + 1, j, n, m);
        }
        if (j != 0 && dp[i][j - 1] != -1) {
            f(dp, i, j - 1, n, m);
        }
        if (j != m - 1 && dp[i][j + 1] != -1) {
            f(dp, i, j + 1, n, m);
        }

    }
}
