package com.lemonade.leetcode.t1000.t100;

public class JumpGame55 {

    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int i = nums.length - 2;
        int n = 0;
        while (i > 0) {
            if (nums[i] > n) {
                n = 0;
            } else {
                n++;
            }
            i--;
        }

        if (nums[0] > n) {
            return true;
        }
        return false;
    }
}
