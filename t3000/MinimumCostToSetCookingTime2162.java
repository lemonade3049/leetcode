package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class MinimumCostToSetCookingTime2162 {

    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int[][] arr = new int[2][2];
        arr[0] = new int[]{targetSeconds / 60, targetSeconds % 60};
        arr[1] = new int[]{targetSeconds / 60 - 1, targetSeconds % 60 + 60};

        return Math.min(f(arr[0], startAt, moveCost, pushCost), f(arr[1], startAt, moveCost, pushCost));
    }

    int f(int[] arr, int startAt, int moveCost, int pushCost) {
        if (arr[0] > 99 || arr[1] > 99 || arr[0] < 0) {
            return Integer.MAX_VALUE;
        }
        String str = String.valueOf(arr[0] * 100 + arr[1]);
        int res = 0;
        char[] charArr = str.toCharArray();
        if (charArr[0] - '0' != startAt) {
            res += moveCost;
        }
        res += pushCost;

        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] != charArr[i - 1]) {
                res += moveCost;
            }
            res += pushCost;
        }
        return res;
    }
}
