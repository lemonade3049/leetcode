package com.lemonade.leetcode.t1000.t100;

import java.util.Arrays;
@SuppressWarnings("unused")
public class ThreeSumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }

            }
        }
        return res;
    }

}
