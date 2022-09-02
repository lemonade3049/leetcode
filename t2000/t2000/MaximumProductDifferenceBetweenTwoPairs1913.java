package com.lemonade.leetcode.t2000.t2000;

public class MaximumProductDifferenceBetweenTwoPairs1913 {
    public static void main(String[] args) {
        new MaximumProductDifferenceBetweenTwoPairs1913().maxProductDifference(new int[]{5, 6, 2, 7, 4});
    }

    public int maxProductDifference(int[] nums) {
        int[] big = new int[2];
        int[] small = new int[2];
        small[0] = Integer.MAX_VALUE;
        small[1] = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > big[0]) {
                big[1] = big[0];
                big[0] = nums[i];
            } else if (nums[i] > big[1]) {
                big[1] = nums[i];
            }

            if (nums[i] < small[0]) {
                small[1] = small[0];
                small[0] = nums[i];
            } else if (nums[i] < small[1]) {
                small[1] = nums[i];
            }
        }

        return big[0] * big[1] - small[0] * small[1];

    }
}
