package com.lemonade.leetcode.t3000;

public class CountElementsWithStrictlySmallerAndGreaterElements2148 {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minNum = 0;
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (min > n) {
                min = n;
                minNum = 1;
            } else if (min == n) {
                minNum++;
            }
            if (max < n) {
                max = n;
                maxNum = 1;
            } else if (max == n) {
                maxNum++;
            }
        }
        if (min == max) {
            return 0;
        } else {
            return nums.length - minNum - maxNum;
        }
    }
}
