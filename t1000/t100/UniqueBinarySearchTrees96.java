package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class UniqueBinarySearchTrees96 {

    public int numTrees(int n) {
        int[][] map = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            map[i][i] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                map[j - i][j] = map[j - i][j - 1] + map[j - i + 1][j];
                for (int k = j - i + 1; k < j ; k++) {
                    map[j - i][j] += map[j - i][k - 1] * map[k + 1][j];
                }
            }
        }
        return map[1][n];
    }
}
