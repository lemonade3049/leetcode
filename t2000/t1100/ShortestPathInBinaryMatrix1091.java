package com.lemonade.leetcode.t2000.t1100;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix1091 {
    public static void main(String[] args) {
        int i = new ShortestPathInBinaryMatrix1091().shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}});
        System.out.println(i);
    }

    static class Point {
        int x;
        int y;
        int step;

        Point(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = -1;
                }
            }
        }
        Queue<Point> q = new LinkedList<>();
        grid[0][0] = 1;
        q.add(new Point(0, 0, 1));
        while (!q.isEmpty()) {
            Point poll = q.poll();
            if (poll.x == grid.length - 1 && poll.y == grid[0].length - 1) {
                break;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    if (setGrid(poll.x + i - 1, poll.y + j - 1, poll.step + 1, grid)) {
                        q.offer(new Point(poll.x + i - 1, poll.y + j - 1, poll.step + 1));
                    }
                }
            }
        }
        int ans = grid[grid.length - 1][grid[0].length - 1];
        return ans == 0 ? -1 : ans;
    }

    private boolean setGrid(int x, int y, int step, int[][] grid) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != 0) {
            return false;
        }
        grid[x][y] = step;
        return true;
    }
}
