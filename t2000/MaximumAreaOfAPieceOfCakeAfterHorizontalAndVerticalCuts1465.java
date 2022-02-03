package com.lemonade.leetcode.t2000;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts1465 {
    public static void main(String[] args) {
        int res = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts1465().maxArea(
                1000000000,
                1000000000, new int[]{2}, new int[]{2});
        System.out.println(res);
        System.out.println(1e9 + 7);
    }

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int pre = 0;
        int maxHorizon = 0;
        for (int i = 0; i < horizontalCuts.length; i++) {
            maxHorizon = Math.max(maxHorizon, horizontalCuts[i] - pre);
            pre = horizontalCuts[i];
        }
        maxHorizon = Math.max(maxHorizon, h - horizontalCuts[horizontalCuts.length - 1]);

        pre = 0;
        int maxVertical = 0;
        for (int i = 0; i < verticalCuts.length; i++) {
            maxVertical = Math.max(maxVertical, verticalCuts[i] - pre);
            pre = verticalCuts[i];
        }
        maxVertical = Math.max(maxVertical, w - verticalCuts[verticalCuts.length - 1]);
        long module = (long) (1e9 + 7);
        long res = (long) maxHorizon * (long) maxVertical;
        System.out.println(res);
        return (int) (res % module);
    }
}
