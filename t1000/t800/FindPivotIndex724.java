package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class FindPivotIndex724 {

    public int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;

        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            rSum += nums[i];
        }

        while (lSum != rSum && res < nums.length - 1) {
            lSum += nums[res];
            res++;
            rSum -= nums[res];
        }

        return lSum == rSum ? res : -1;
    }
}
