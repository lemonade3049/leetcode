package com.lemonade.leetcode.t1000.t300;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map map = new HashMap();

        for (int i = 0; i < Math.min(nums.length, k); i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }


        if (k >= nums.length) {
            return false;
        }

        for (int i = k; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && (int) map.get(nums[i]) == 1) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
            map.put(nums[i - k], (int) map.get(nums[i - k]) - 1);
        }
        return false;
    }
}
