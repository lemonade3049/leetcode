package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int res = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                res = Math.max(res, height[l] * (r - l));
                l++;
            } else if (height[l] > height[r]) {
                res = Math.max(res, height[r] * (r - l));
                r--;
            } else {
                res = Math.max(res, height[r] * (r - l));
                r--;
                l++;
            }
        }
        return res;
    }
}
