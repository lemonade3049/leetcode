package com.lemonade.leetcode.t1000.t600;

import java.util.HashMap;

@SuppressWarnings("unused")
public class KDiffPairsInAnArray532 {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if (k != 0) {
                if (map.containsKey(num)) {
                    continue;
                }
                if (map.containsKey(num + k)) {
                    res++;
                }
                if (map.containsKey(num - k)) {
                    res++;
                }
            } else {
                if (map.getOrDefault(num, 0) == 1) {
                    res++;
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return res;
    }
}
