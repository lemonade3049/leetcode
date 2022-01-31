package com.lemonade.leetcode.t1000.t100;
@SuppressWarnings("unused")
public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {
        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            tempSum += num;
            maxSum = Math.max(maxSum, tempSum);
            if (tempSum < 0) {
                tempSum = 0;
            }
        }
        return maxSum;
    }
}
