package com.lemonade.leetcode.t1000.t200;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }


    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (max < item.getValue()) {
                res = item.getKey();
                max = item.getValue();
            }

        }
        return res;
    }
}
