package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class JumpGame2_45 {


    public int jump(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < i + nums[i] + 1; j++) {
                if (dp[j] == 0) {
                    dp[j] = dp[i] + 1;
                }
                if (j == nums.length - 1) {
                    return dp[nums.length - 1];
                }
            }
        }
        return dp[nums.length - 1];

    }
}
