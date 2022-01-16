package com.lemonade.leetcode.t1000.t500;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int end = intervals[0][1];
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (end > intervals[i][0]) {
                end = Math.min(intervals[i][1], end);
                res++;
            }else{
                end = Math.max(intervals[i][1], end);
            }
        }
        return res;
    }
}
