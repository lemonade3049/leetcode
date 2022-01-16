package com.lemonade.leetcode.t1000.t400;

public class RotateFunction396 {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += i * nums[i];
        }

        int max = sum1;

        for (int i = 0; i < nums.length; i++) {
            int sum2 = sum1 + sum - nums.length * nums[nums.length - 1 - i];
            max = Math.max(max, sum2);
        }
        return max;
    }
}
