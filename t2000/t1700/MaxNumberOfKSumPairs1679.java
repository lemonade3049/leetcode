package com.lemonade.leetcode.t2000.t1700;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class MaxNumberOfKSumPairs1679 {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == k - entry.getKey()) {
                res += entry.getValue();
            } else {
                res += Math.min(entry.getValue(), map.getOrDefault(k - entry.getKey(), 0));
            }
        }
        return res / 2;
    }
}
