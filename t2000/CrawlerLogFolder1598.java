package com.lemonade.leetcode.t2000;

@SuppressWarnings("unused")
public class CrawlerLogFolder1598 {


    public int minOperations(String[] logs) {
        int res = 0;

        for (String log : logs) {
            if ("../".equals(log)) {
                if (res > 0) {
                    res--;
                }
            } else if (!"./".equals(log)) {
                res++;
            }
        }
        return res;
    }
}
