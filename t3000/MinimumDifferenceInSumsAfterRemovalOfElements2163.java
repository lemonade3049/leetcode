package com.lemonade.leetcode.t3000;

import java.util.PriorityQueue;

@SuppressWarnings({"unused", "ConstantConditions"})
public class MinimumDifferenceInSumsAfterRemovalOfElements2163 {

    public static void main(String[] args) {
        long x = new MinimumDifferenceInSumsAfterRemovalOfElements2163().minimumDifference(new int[]{16, 46, 43, 41, 42, 14, 36, 49, 50, 28, 38, 25, 17, 5, 18, 11, 14, 21, 23, 39, 23});
        System.out.println(x);
    }

    public long minimumDifference(int[] nums) {
        PriorityQueue<Integer> pL = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> pR = new PriorityQueue<>();
        int n = nums.length / 3;
        long sumL = 0;
        long sumR = 0;
        for (int i = 0; i < n; i++) {
            pL.offer(nums[i]);
            sumL += nums[i];
            pR.offer(nums[i + 2 * n]);
            sumR += nums[i + 2 * n];
        }
        long[] sums = new long[n + 1];
        sums[0] = sumL;
        sums[n] = -sumR;
        for (int i = n; i < 2 * n; i++) {
            if (nums[i] < pL.peek()) {
                sumL -= pL.poll();
                pL.offer(nums[i]);
                sumL += nums[i];
            }
            sums[i - n + 1] += sumL;
            if (nums[3 * n - i - 1] > pR.peek()) {
                sumR -= pR.poll();
                pR.offer(nums[3 * n - i - 1]);
                sumR += nums[3 * n - i - 1];
            }
            sums[2 * n - i - 1] -= sumR;
        }
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n + 1; i++) {
            min = Math.min(min, sums[i]);
        }
        return min;
    }
}
