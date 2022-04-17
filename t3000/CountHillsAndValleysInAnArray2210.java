package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class CountHillsAndValleysInAnArray2210 {

    public int countHillValley(int[] nums) {
        boolean isIncreasing = false;
        int left = 0;
        while (left < nums.length - 1) {
            if (nums[left + 1] > nums[left]) {
                isIncreasing = true;
                break;
            } else if (nums[left + 1] < nums[left]) {
                isIncreasing = false;
                break;
            }
        }

        int right = nums.length - 1;

        while (right > 0) {
            if (nums[right - 1] != nums[right]) {
                break;
            }
        }

        for (int i = 1; i < nums.length; i++) {

        }
        return 1;
    }
}
