package com.lemonade.leetcode.t3000;

import java.util.Arrays;
@SuppressWarnings("unused")
public class MinimumCostOfBuyingCandiesWithDiscount2144 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        for (int j : cost) {
            res += j;
        }
        for (int i = cost.length - 3; i >= 0; i -= 3) {
            res -= cost[i];
        }
        return res;
    }
}
