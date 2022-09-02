package com.lemonade.leetcode.t2000.t1100;

public class PairsOfSongsWithTotalDurationsDivisibleBy60_1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        for (int j : time) {
            arr[j % 60]++;
        }
        int res = 0;
        for (int i = 1; i < 30; i++) {
            res += arr[i] * arr[60 - i];
        }
        res += arr[0] * (arr[0] - 1) / 2;
        res += arr[30] * (arr[30] - 1) / 2;
        return res;
    }
}
