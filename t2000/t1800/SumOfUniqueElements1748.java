package com.lemonade.leetcode.t2000.t1800;

@SuppressWarnings("unused")
public class SumOfUniqueElements1748 {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                res += i;
            }
        }
        return res;
    }
}
