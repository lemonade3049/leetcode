package com.lemonade.leetcode.t1000.t100;

import java.util.HashMap;
@SuppressWarnings("unused")
public class SudokuSolver37 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, int[]> rowMap = new HashMap<>();
        HashMap<Integer, int[]> colMap = new HashMap<>();
        HashMap<Integer, int[]> recMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rowMap.put(i, new int[9]);
            colMap.put(i, new int[9]);
            recMap.put(i, new int[9]);
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                char val = board[row][col];
                if (val == '.') {
                    continue;
                }
                if (rowMap.get(row)[val - '0'] == 1 ||
                        colMap.get(col)[val - '0'] == 1 ||
                        recMap.get(row / 3 + col / 3 * 3)[val - '0'] == 1
                ) {
                    return false;
                } else {
                    rowMap.get(row)[val - '0'] = 1;
                    colMap.get(col)[val - '0'] = 1;
                    recMap.get(row / 3 + col / 3 * 3)[val - '0'] = 1;
                }
            }
        }
        return true;
    }
}
