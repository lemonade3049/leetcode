package com.lemonade.leetcode.t1000.t500;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons452 {

    public static void main(String[] args) {
        System.out.println(new MinimumNumberOfArrowsToBurstBalloons452().findMinArrowShots(new int[][]{new int[]{10, 16}, new int[]{2, 8}, new int[]{1, 6}, new int[]{7, 12}}));
    }

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int end = points[0][1];
        int res = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;
            } else {
                end = points[i][1];
                res++;
            }
        }
        return res;
    }
}
