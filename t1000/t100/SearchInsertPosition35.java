package com.lemonade.leetcode.t1000.t100;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        return f(nums, 0, nums.length - 1, target);
    }

    public static int f(int[] nums, int s, int e, int target) {
        if(nums[s] > target){
            return  s;
        }
        int mid = (s + e) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return f(nums, s, mid, target);
        } else {
            return f(nums, mid + 1, s, target);
        }
    }
}
