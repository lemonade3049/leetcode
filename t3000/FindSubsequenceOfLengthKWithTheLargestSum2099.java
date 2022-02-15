package com.lemonade.leetcode.t3000;

import java.util.Arrays;

@SuppressWarnings("unused")
public class FindSubsequenceOfLengthKWithTheLargestSum2099 {

    public int[] maxSubsequence(int[] nums, int k) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        Arrays.sort(temp);

        int threshold = temp[nums.length - k];
        int rest = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (threshold == temp[i]) {
                rest = i - nums.length + k + 1;
                break;
            }
        }
        int[] res = new int[k];
        int index = 0;
        for (int num : nums) {
            if (num > threshold || (num == threshold && rest-- > 0)) {
                res[index++] = num;
            }
        }
        return res;
    }
}
