package com.lemonade.leetcode.t1000.t100;

public class MinimumPathSum64 {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0] = new int[]{1, 3};
        arr[1] = new int[]{1, 5};
        arr[2] = new int[]{1, 5};
        new MinimumPathSum64().minPathSum(arr);
    }

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = row + col - 2;

        int[][] dp = new int[row][col];

        dp[0][0] = grid[0][0];
        for (int sum = 1; sum <= max; sum++) {
            if (sum < row) {
                for (int r = sum, c = 0; r >= 0 && c < col; r--, c++) {
                    check(grid, dp, r, c);
                }
            } else {
                for (int r = row - 1, c = sum - r; c < col && r >= 0; r--, c++) {
                    check(grid, dp, r, c);
                }
            }
        }


        return dp[row - 1][col - 1];
    }

    private void check(int[][] grid, int[][] dp, int r, int c) {
        if (c == 0) {
            dp[r][c] = dp[r - 1][c] + grid[r][c];
        } else if (r == 0) {
            dp[r][c] = dp[r][c - 1] + grid[r][c];
        } else {
            dp[r][c] = Math.min(dp[r - 1][c], dp[r][c - 1]) + grid[r][c];
        }
    }
}
