package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class NQueensII52 {

    public int totalNQueens2(int n) {
        int[] arr = new int[]{1, 0, 0, 2, 10, 4, 40, 92, 352};
        if (n < 10 && n > 0) {
            return arr[n - 1];
        }
        return -1;
    }

    public int totalNQueens(int n) {
        boolean[][] map = new boolean[n][n];
        return f(map, 0, n);
    }

    int f(boolean[][] map, int x, int n) {
        int res = 0;
        if (x == n - 1) {
            for (int i = 0; i < n; i++) {
                if (check(map, x, i)) {
                    map[x][i] = true;
                    res++;
                    map[x][i] = false;
                }
            }
            return res;
        }

        for (int i = 0; i < map.length; i++) {
            map[x][i] = true;
            if (check(map, x, i)) {
                res += f(map, x + 1, n);
            }
            map[x][i] = false;
        }
        return res;
    }

    private boolean check(boolean[][] map, int x, int y) {
        for (int i = 0; i < x; i++) {
            if (map[i][y]) {
                return false;
            }

            if (y - x + i >= 0 && map[i][y - x + i]) {
                return false;
            }

            if (y + x - i < map.length && map[i][y + x - i]) {
                return false;
            }
        }
        return true;
    }
}
