package com.lemonade.leetcode.t1000.t600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference539 {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        List<String> list = new ArrayList<>();
        list.add("00:00");
        list.add("23:59");

        new MinimumTimeDifference539().findMinDifference(list);
    }

    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if (n > 1440) {
            return 0;
        }
        int arr[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String[] temp = timePoints.get(i).split(":");
            arr[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        }

        arr[n] = Integer.MAX_VALUE;

        Arrays.sort(arr);
        arr[n] = arr[0] + 1440;
        int min = 10000;
        for (int i = 1; i <= n; i++) {
            min = Math.min(arr[i] - arr[i - 1], min);
            if (min == 0) {
                return min;
            }
        }

        return min;
    }
}
