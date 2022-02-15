package com.lemonade.leetcode.t3000;
@SuppressWarnings("unused")
public class SortEvenAndOddIndicesIndependently2164 {

    public int[] sortEvenOdd(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
