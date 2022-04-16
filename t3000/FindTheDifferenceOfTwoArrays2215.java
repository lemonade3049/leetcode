package com.lemonade.leetcode.t3000;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class FindTheDifferenceOfTwoArrays2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int[] arr = new int[2001];
        for (int j : nums1) {
            arr[j + 1000] |= 1;
        }

        for (int j : nums2) {
            arr[j + 1000] |= 2;
        }
        List<Integer> l1 = new ArrayList<>(1000);
        List<Integer> l2 = new ArrayList<>(1000);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                l1.add(i - 1000);
            }

            if (arr[i] == 2) {
                l2.add(i - 1000);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(l1);
        res.add(l2);
        return res;
    }
}
