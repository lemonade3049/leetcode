package com.lemonade.leetcode.t2000;

import javax.swing.text.Highlighter;
import java.util.LinkedList;
import java.util.Queue;

public class MapOfHighestPeak1765 {
    public static void main(String[] args) {
        highestPeak(new int[][]{new int[]{0, 1}, new int[]{0, 0}});
    }

    static class Point {
        int x;
        int y;
        int val;

        Point(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.val = v;
        }
    }

    public static int[][] highestPeak(int[][] isWater) {
        Queue<Point> q = new LinkedList<>();
        int n = isWater.length;
        int m = isWater[0].length;

        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isWater[i][j] == 1) {
                    q.offer(new Point(i, j, 1));
                } else {
                    res[i][j] = -1;
                }
            }
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.x != 0 && res[p.x - 1][p.y] == -1) {
                res[p.x - 1][p.y] = p.val;
                q.offer(new Point(p.x - 1, p.y, p.val + 1));
            }

            if (p.x != n - 1 && res[p.x + 1][p.y] == -1) {
                res[p.x + 1][p.y] = p.val;
                q.offer(new Point(p.x + 1, p.y, p.val + 1));
            }
            if (p.y != 0 && res[p.x][p.y - 1] == -1) {
                res[p.x][p.y - 1] = p.val;
                q.offer(new Point(p.x, p.y - 1, p.val + 1));
            }
            if (p.y != m - 1 && res[p.x][p.y + 1] == -1) {
                res[p.x][p.y + 1] = p.val;
                q.offer(new Point(p.x, p.y + 1, p.val + 1));
            }
        }
        return res;
    }
}
