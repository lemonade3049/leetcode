package com.lemonade.leetcode.t2000;

import com.sun.source.tree.Tree;

public class StoneGameIV1510 {

    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        dp[0] = false;
        dp[1] = true;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = check(i, dp);
        }

        return dp[n];
    }

    boolean check(int n, boolean[] dp) {
        int i = 1;
        while (i * i <= n) {
            if(!dp[n - i * i]){
                return true;
            }
            i++;
        }

        return false;
    }
}
