package com.lemonade.leetcode.t1000.t600;

import java.util.Arrays;

public class ContiguousArray525 {

    public static void main(String[] args) {
        int res = new ContiguousArray525().findMaxLength(new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1});
        System.out.println(res);
    }

    public int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];

        int now = nums.length;
        int max = 0;
        Arrays.fill(arr, -2);
        arr[now] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                now--;
            } else {
                now++;
            }

            if (arr[now] != -2) {
                max = Math.max(max, i - arr[now]);
            } else {
                arr[now] = i;
            }
        }
        return max;
    }

}
