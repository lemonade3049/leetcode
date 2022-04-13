package com.lemonade.leetcode.t1000.t900;

@SuppressWarnings("unused")
public class SpiralMatrixIII885 {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2];
        int index = 0;
        int rEnd = rStart + 1;
        int cEnd = cStart + 1;
        while (index < rows * cols) {
            index = f(res, index, rStart, cStart, rEnd, cEnd, rows, cols);
            rStart--;
            cStart--;
            rEnd++;
            cEnd++;
        }
        return res;
    }


    private int f(int[][] res, int index, int rStart, int cStart, int rEnd, int cEnd, int rows, int cols) {
        for (int i = cStart; i < cEnd; i++) {
            if (rStart >= 0 && rStart < rows && i >= 0 && i < cols) {
                res[index][0] = rStart;
                res[index++][1] = i;
            }
        }
        for (int i = rStart; i < rEnd; i++) {
            if (i >= 0 && i < rows && cEnd >= 0 && cEnd < cols) {
                res[index][0] = i;
                res[index++][1] = cEnd;
            }
        }
        for (int i = cEnd; i >= cStart; i--) {
            if (rEnd >= 0 && rEnd < rows && i >= 0 && i < cols) {
                res[index][0] = rEnd;
                res[index++][1] = i;
            }
        }
        for (int i = rEnd; i >= rStart; i--) {
            if (i >= 0 && i < rows && cStart - 1 >= 0 && cStart - 1 < cols) {
                res[index][0] = i;
                res[index++][1] = cStart - 1;
            }
        }
        return index;
    }
}
