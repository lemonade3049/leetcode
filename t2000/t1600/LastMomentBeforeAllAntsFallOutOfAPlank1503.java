package com.lemonade.leetcode.t2000.t1600;


public class LastMomentBeforeAllAntsFallOutOfAPlank1503 {
    // interesting
    // need not consider changing directions
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = -1;
        int min = n + 1;

        for (int i = 0; i < left.length; i++) {
            max = Math.max(max, left[i]);
        }

        for (int i = 0; i < right.length; i++) {
            min = Math.min(min, right[i]);
        }
        return Math.max(n - min, max);

    }
}
