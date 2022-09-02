package com.lemonade.leetcode.t2000.t1100;

public class HeightChecker1051 {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{2, 6, 8, 6, 5, 2, 4, 3, 7, 3, 7, 5, 6, 6, 2, 4, 4, 6, 8, 4, 5}));
    }

    public static int heightChecker(int[] heights) {
        int len = heights.length;
        int[] temp = new int[101];
        for (int height : heights) {
            temp[height]++;
        }
        int res = 0;
        int total = 0;
        for (int i = 0, j = 1; i < len; i++) {
            while (i >= total) {
                total += temp[j++];
            }
            if (j != heights[i] + 1) {
                res++;
            }
        }

        return res;
    }
}
