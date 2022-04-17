package com.lemonade.leetcode.t2000;

@SuppressWarnings("unused")
public class JumpGame3_1306 {
    public boolean canReach(int[] arr, int start) {
        int[] dp = new int[arr.length];


        return f(dp, arr, start);

    }

    boolean f(int[] dp, int[] arr, int index) {
        if(arr[index] == 0){
            return true;
        }
        if (dp[index] == 1) {
            return false;
        }

        dp[index] = 1;
        boolean res1 = false;
        boolean res2 = false;
        if(index - arr[index] >= 0){
            res1 = f(dp, arr, index - arr[index]);
        }

        if(index + arr[index] < arr.length){
            res2 = f(dp, arr, index + arr[index]);
        }
        return res1 || res2;
    }
}
