package com.lemonade.leetcode.t1000.t300;

@SuppressWarnings("unused")
public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                swap(nums, i, index);
                index++;
            }
        }

    }

    private void swap(int[] nums, int i, int index) {
        int t = nums[i];
        nums[i] = nums[index];
        nums[index] = t;
    }
}
