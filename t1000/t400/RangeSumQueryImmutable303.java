package com.lemonade.leetcode.t1000.t400;

public class RangeSumQueryImmutable303 {
    class NumArray {

        int[] dp;

        public NumArray(int[] nums) {
            dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            int res = dp[right];
            if (left != 0) {
                res -= dp[left - 1];
            }

            return res;
        }
    }
}
