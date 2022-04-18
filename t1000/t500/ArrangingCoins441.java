package com.lemonade.leetcode.t1000.t500;

@SuppressWarnings("unused")
public class ArrangingCoins441 {
    public int arrangeCoins(int n) {

        double v = -0.5 + Math.sqrt(1 + 8.0 * n) / 2;
        return (int) v;
    }
}
