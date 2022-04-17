package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class RearrangeArrayElementsBySign2149 {

    public int[] rearrangeArray(int[] nums) {
        int[] newNums = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;
        for (int num : nums) {
            if (num > 0) {
                newNums[posIndex] = num;
                posIndex += 2;
            } else {
                newNums[negIndex] = num;
                negIndex += 2;
            }
        }

        return newNums;
    }
}
