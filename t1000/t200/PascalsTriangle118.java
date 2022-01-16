package com.lemonade.leetcode.t1000.t200;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

    public static void main(String[] args) {
        generate(30);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int [][] dp = new int[numRows][numRows];

        for(int i = 0; i < numRows; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
            for(int j = 0; j <= i; j++){
                list.add(dp[i][j]);
            }
            res.add(list);
        }

        return res;
    }
}
