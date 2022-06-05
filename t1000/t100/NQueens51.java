package com.lemonade.leetcode.t1000.t100;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class NQueens51 {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] map = new boolean[n][n];
        List<List<String>> res = new ArrayList<>();
        f(map, 0, res);
        return res;
    }

    private void f(boolean[][] map, int x, List<List<String>> res) {
        if (x == map.length - 1) {
            for (int i = 0; i < map.length; i++) {

                if (check(map, x, i)) {
                    map[x][i] = true;
                    res.add(toList(map));
                    map[x][i] = false;
                }
            }
            return;
        }

        for (int i = 0; i < map.length; i++) {
            map[x][i] = true;
            if (check(map, x, i)) {
                f(map, x + 1, res);
            }
            map[x][i] = false;
        }
    }

    private List<String> toList(boolean[][] map) {
        List<String> list = new ArrayList<>();
        for (boolean[] booleans : map) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < map[0].length; j++) {
                sb.append(booleans[j] ? 'Q' : '.');
            }
            list.add(String.valueOf(sb));
        }
        return list;
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
