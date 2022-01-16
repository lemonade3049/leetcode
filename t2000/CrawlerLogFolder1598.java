package com.lemonade.leetcode.t2000;

import java.util.Stack;

public class CrawlerLogFolder1598 {


    public int minOperations(String[] logs) {
        int res = 0;

        for (int i = 0; i < logs.length; i++) {
            if ("../".equals(logs[i])) {
                if (res > 0) {
                    res--;
                }
            } else if ("./".equals(logs[i])) {

            } else {
                res++;
            }
        }
        return res;
    }
}
