package com.lemonade.leetcode.t2000.t1600;

public class MinimumTimeToMakeRopeColorful1578 {

    public int minCost(String colors, int[] neededTime) {
        char[] colorArr = colors.toCharArray();

        int start = -1;
        int res = 0;
        for (int i = 1; i < colorArr.length; i++) {
            if (colorArr[i] == colorArr[i - 1] && start == -1) {
                start = i - 1;
            }
            if (colorArr[i] != colorArr[i - 1] && start != -1) {
                res += f(neededTime, start, i - 1);
                start = -1;
            }
        }
        return res;
    }

    static int f(int[] neededTime, int start, int end) {
        int biggest = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += neededTime[i];
            biggest = Math.max(biggest, neededTime[i]);
        }
        return sum - biggest;
    }


}
