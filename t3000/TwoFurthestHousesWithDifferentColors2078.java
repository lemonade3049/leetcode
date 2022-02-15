package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class TwoFurthestHousesWithDifferentColors2078 {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[j][j] = 0;
                } else if (colors[i] == colors[j]) {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                } else {
                    dp[i][j] = j - i;
                }
            }
        }
        return dp[0][n - 1];
    }

    int f(int[] colors, int l, int r) {
        if (colors[l] == colors[r]) {
            return Math.max(f(colors, l + 1, r), f(colors, l, r - 1));
        }
        return r - l;
    }
}
