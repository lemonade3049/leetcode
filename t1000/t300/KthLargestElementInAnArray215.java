package com.lemonade.leetcode.t1000.t300;

public class KthLargestElementInAnArray215 {

    public static void main(String[] args) {
        int x = findKthLargest(new int[]{4, 2, 1, 5, 6}, 2);
        System.out.println(x);
    }

    public static int findKthLargest(int[] nums, int k) {

        return f(nums, 0, nums.length - 1, k);
    }

    public static int f(int[] nums, int start, int end, int n) {

        int key = nums[start];
        int l = start;
        int r = start + 1;
        for (int i = r; i <= end; i++) {
            if (nums[i] == key) {
                swap(nums, i, r);
                r++;
            } else if (nums[i] > key) {
                swap(nums, i, r);
                swap(nums, l, r);
                r++;
                l++;
            }
        }
        if (l <= n && r >= n) {
            return key;
        } else if (l > n) {
            return f(nums, 0, l, n);
        } else {
            return f(nums, r, end, n);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
