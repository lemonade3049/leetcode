package com.lemonade.leetcode.t1000.t500;

public class OnesAndZeroes474 {
    public static void main(String[] args) {
        System.out.println(new OnesAndZeroes474().findMaxForm(new String[]{"10", "0", "1"}, 1, 1));
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] arrs = new int[strs.length][2];
        for (int i = 0; i < strs.length; i++) {
            arrs[i] = get(strs[i]);
        }
        int[][][] dp = new int[strs.length][m + 1][n + 1];
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < m + 1; j++) {
                for (int k = 0; k < n + 1; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return f(0, strs, m, n, dp, arrs);
    }

    private int f(int i, String[] strs, int m, int n, int[][][] dp, int[][] arrs) {

        int[] arr = arrs[i];
        if (arr[0] <= m && arr[1] <= n) {
            if (i + 1 == strs.length) {
                dp[i][m][n] = 1;

            } else {
                int one = dp[i + 1][m - arr[0]][n - arr[1]];
                if (one == -1) {
                    one = f(i + 1, strs, m - arr[0], n - arr[1], dp, arrs);
                }
                int other = dp[i + 1][m][n];
                if (other == -1) {
                    other = f(i + 1, strs, m, n, dp, arrs);
                }
                dp[i][m][n] = Math.max(1 + one, other);
            }
        } else {
            if (i + 1 == strs.length) {
                dp[i][m][n] = 0;

            } else {
                int other = dp[i + 1][m][n];
                if (other == -1) {
                    other = f(i + 1, strs, m, n, dp, arrs);
                }
                dp[i][m][n] = other;
            }
        }
        return dp[i][m][n];
    }

    private int[] get(String str) {
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }
        return new int[]{zeros, ones};
    }
}
