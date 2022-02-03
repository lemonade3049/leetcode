package com.lemonade.leetcode.t1000.t500;

import java.util.HashMap;

@SuppressWarnings("unused")
public class FourSunII454 {
    public static void main(String[] args) {
        int i = 40000;
        i *= i;
        System.out.println(i);
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = -nums3[i] - nums4[j];
                res += map.getOrDefault(sum, 0);
            }
        }
        return res;
    }
}
