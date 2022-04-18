package com.lemonade.leetcode.t1000.t500;

@SuppressWarnings("unused")
public class NumberOfSegmentsInAString434 {

    public int countSegments(String s) {
        int res = 0;
        String[] s1 = s.split(" ");
        for (String value : s1) {
            if (!"".equals(value)) {
                res++;
            }
        }
        return res;
    }
}
