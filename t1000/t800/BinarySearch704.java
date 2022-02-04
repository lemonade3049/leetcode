package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class BinarySearch704 {
    public static void main(String[] args) {
        int x = new BinarySearch704().search(new int[]{1, 2, 3}, 1);
        System.out.println(x);
    }

    public int search(int[] nums, int target) {
        return f(nums, 0, nums.length - 1, target);
    }

    int f(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else {
            if (target > nums[mid]) {
                return f(nums, mid + 1, end, target);
            } else {
                return f(nums, start, mid - 1, target);
            }
        }
    }
}
