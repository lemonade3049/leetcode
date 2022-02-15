package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class CountNumberOfPairsWithAbsoluteDifferenceK2006 {
    public int countKDifference(int[] nums, int k) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        int res = 0;
        for (int i = 0; i < arr.length - k; i++) {
            res += arr[i] * arr[i + k];
        }
        return res;
    }
}
