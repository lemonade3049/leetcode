package com.lemonade.leetcode.t2000;

public class WaysToSplitArrayIntoThreeSubarrays1712 {
    public static void main(String[] args) {
        System.out.println(waysToSplit(new int[100000]));
    }

    public static int waysToSplit(int[] nums) {
        long sum[] = new long[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        int r1 = 1;
        int r2 = 2;
        int res = 0;
        long total = sum[sum.length - 1];
        for (int i = 0; i < sum.length - 2 && sum[i] <= total / 3; i++) {
            r1 = Math.max(r1, i + 1);
            while (r1 <= i && sum[r1] < 2 * sum[i]) {
                r1++;
            }
            r2 = Math.max(r2, i + 2);
            while (r2 < sum.length && sum[r2] <= sum[i] + (total - sum[i]) / 2.0) {
                r2++;
            }
            res += r2 - r1;
        }
        return res;
    }
}
