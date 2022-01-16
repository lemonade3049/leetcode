package com.lemonade.leetcode.t1000.t100;

public class RemoveElement27 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length;
        while (l < r) {
            if (nums[l] == val) {
                nums[l] = nums[r - 1];
                r--;
            } else {
                l++;
            }
        }
        return r;
    }
}
