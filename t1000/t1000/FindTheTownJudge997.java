package com.lemonade.leetcode.t1000.t1000;

public class FindTheTownJudge997 {
    public int findJudge(int n, int[][] trust) {
        int[] trustArr = new int[n];
        int[] trustedArr = new int[n];
        for (int i = 0; i < trust.length; i++) {
            trustArr[trust[i][0] - 1]++;
            trustedArr[trust[i][1] - 1]++;
        }
        int resNum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (trustedArr[i] == n - 1 && trustArr[i] == 0) {
                resNum++;
                res = i;
            }
        }
        if (resNum == 1) {
            return res + 1;
        }
        return -1;
    }

}
