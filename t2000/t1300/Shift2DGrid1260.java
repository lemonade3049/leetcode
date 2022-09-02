package com.lemonade.leetcode.t2000.t1300;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Shift2DGrid1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int x = grid.length;
        int y = grid[0].length;
        int size = x * y;
        k = k % size;

        int[] temp = new int[k];

        for (int i = size - k; i < size; i++) {
            temp[i - size + k] = grid[i / y][i % y];
        }

        for (int i = size - 1; i >= k; i--) {
            grid[i / y][i % y] = grid[(i - k) / y][(i - k) % y];
        }

        for (int i = 0; i < k; i++) {
            grid[i / y][i % y] = temp[i];
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int[] ints : grid) {
            List<Integer> item = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                item.add(ints[j]);
            }
            list.add(item);
        }

        return list;
    }


}
