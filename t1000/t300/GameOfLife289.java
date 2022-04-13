package com.lemonade.leetcode.t1000.t300;


@SuppressWarnings("unused")
public class GameOfLife289 {

    public void gameOfLife(int[][] board) {
        int h = board.length;
        int w = board[0].length;


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int nums = getNeighbors(board, i, j, h, w);

                if (board[i][j] == 0 && nums == 3) {
                    board[i][j] |= 2;
                } else if (board[i][j] == 1 && (nums == 2 || nums == 3)) {
                    board[i][j] |= 2;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                board[i][j] >>>= 1;
            }
        }
    }

    private int getNeighbors(int[][] res, int i, int j, int h, int w) {
        int num = 0;
        for (int k = Math.max(i - 1, 0); k < Math.min(i + 2, h); k++) {
            for (int l = Math.max(j - 1, 0); l < Math.min(j + 2, w); l++) {
                if (k == i && l == j) {
                    continue;
                }
                num += res[k][l] & 1;
            }
        }
        return num;
    }
}
