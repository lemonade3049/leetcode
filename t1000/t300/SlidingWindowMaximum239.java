package com.lemonade.leetcode.t1000.t300;

import java.util.LinkedList;

/**
 * not finished
 */
@SuppressWarnings("unused")
public class SlidingWindowMaximum239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            if (list.isEmpty()) {
                list.offerFirst(i);
            } else if (nums[list.peekFirst()] > nums[i]) {
                list.offerFirst(i);
            } else {
                while (!list.isEmpty() && nums[list.peekFirst()] < nums[i]) {
                    list.pollFirst();
                }
                list.offerFirst(i);
            }
        }
        assert !list.isEmpty();
        ans[0] = nums[list.peekFirst()];
        return ans;
    }
}
