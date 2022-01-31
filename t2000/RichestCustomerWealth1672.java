package com.lemonade.leetcode.t2000;

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int[] total = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                total[i] += accounts[i][j];
            }
        }
        int max = 0;
        for (int j : total) {
            max = Math.max(max, j);
        }
        return max;
    }
}
