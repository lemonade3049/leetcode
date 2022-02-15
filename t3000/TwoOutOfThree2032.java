package com.lemonade.leetcode.t3000;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class TwoOutOfThree2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr = new int[101];
        for (int j : nums1) {
            arr[j] |= 1;
        }
        for (int j : nums2) {
            arr[j] |= 2;
        }
        for (int j : nums3) {
            arr[j] |= 4;
        }
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3 || arr[i] == 5 || arr[i] == 6 || arr[i] == 7) {
                list.add(i);
            }
        }
        return list;
    }
}
