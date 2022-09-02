package com.lemonade.leetcode.t2000.t1100;

public class LastStoneWeightII1049 {

    public static void main(String[] args) {
        System.out.println(new LastStoneWeightII1049().lastStoneWeightII(new int[]{31}));
    }

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }

        int[][] arr = new int[stones.length][sum + 1];
        for (int i = 0; i < stones.length; i++) {
            arr[i][sum] = 1;
        }
        if (sum >= 2 * stones[0]) {
            arr[0][sum - 2 * stones[0]] = 1;
        }
        for (int i = 1; i < stones.length; i++) {
            for (int j = sum; j >= 0; j--) {
                if (arr[i - 1][j] == 1 || (j + 2 * stones[i] <= sum && arr[i - 1][j + 2 * stones[i]] == 1)) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i <= sum; i++) {
            for (int j = 0; j < stones.length; j++) {
                if (arr[j][i] != 0) {
                    return i;
                }
            }
        }

        return 0;
    }
}
