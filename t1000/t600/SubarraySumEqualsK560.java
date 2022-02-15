package com.lemonade.leetcode.t1000.t600;

import java.util.HashMap;

@SuppressWarnings("unused")
public class SubarraySumEqualsK560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sums = new int[n];
        sums[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += map.getOrDefault(sums[i] - k, 0);
            map.put(sums[i], map.getOrDefault(sums[i], 0) + 1);
        }
        res += map.getOrDefault(k, 0);
        return res;

    }
}
