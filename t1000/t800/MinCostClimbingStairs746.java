package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class MinCostClimbingStairs746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] res = new int[n];
        res[0] = cost[0];
        res[1] = cost[1];

        for (int i = 2; i < n; i++) {
            res[i] = cost[i] + Math.min(res[i - 1], res[i - 2]);
        }
        return Math.min(res[n - 1], res[n - 2]);
    }
}
