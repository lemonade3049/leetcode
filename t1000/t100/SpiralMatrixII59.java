package com.lemonade.leetcode.t1000.t100;

public class SpiralMatrixII59 {
    public static void main(String[] args) {
        int[][] ints = new SpiralMatrixII59().generateMatrix(20);
        for (int[] anInt : ints) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(anInt[j] + " ");
            }
            System.out.println();
        }
    }


    public int[][] generateMatrix(int n) {
        int[][] map = new int[n][n];
        int curr = 1;

        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            curr = f(map, i, j, curr);
        }
        return map;
    }

    private int f(int[][] map, int from, int to, int curr) {
        if (from == to) {
            map[from][to] = curr++;
            return curr;
        }

        for (int i = from; i <= to; i++) {
            map[from][i] = curr++;
        }
        for (int i = from + 1; i < to; i++) {
            map[i][to] = curr++;
        }

        for (int i = to; i >= from; i--) {
            map[to][i] = curr++;
        }

        for (int i = to - 1; i > from; i--) {
            map[i][from] = curr++;
        }

        return curr;
    }
}
