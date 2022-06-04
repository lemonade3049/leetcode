package com.lemonade.leetcode.t1000.t1000;

public class UniquePathsIII980 {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(new UniquePathsIII980().uniquePathsIII(grid));
    }

    private int allStep = 0;
    private int startX = 0;
    private int startY = 0;
    private int endX = 0;
    private int endY = 0;
    private int m = 0;
    private int n = 0;

    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int block = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    block++;
                }
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                    grid[i][j] = 0;
                }
                if (grid[i][j] == 2) {
                    endX = i;
                    endY = j;
                    grid[i][j] = 0;
                }
            }
        }
        allStep = m * n - block;
        return f(grid, startX, startY, 1);
    }

    private int f(int[][] grid, int x, int y, int step) {
        if (x == endX && y == endY) {
            if (step == allStep) {
                return 1;
            } else {
                return 0;
            }
        }
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == -1) {
            return 0;
        }
        grid[x][y] = -1;

        int res = f(grid, x + 1, y, step + 1);
        res += f(grid, x - 1, y, step + 1);
        res += f(grid, x, y - 1, step + 1);
        res += f(grid, x, y + 1, step + 1);
        grid[x][y] = 0;
        return res;
    }

}
