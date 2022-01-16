package com.lemonade.leetcode.t1000.t200;

public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0 ; i < columnTitle.length(); i++) {
            res = res * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return res;
    }

}
