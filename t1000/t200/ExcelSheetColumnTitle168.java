package com.lemonade.leetcode.t1000.t200;

public class ExcelSheetColumnTitle168 {

    public static void main(String[] args) {
        System.out.println(convertToTitle(1000000000));
    }

    public static String convertToTitle(int columnNumber) {
        final int num = 26;
        int rest = columnNumber;
        StringBuilder sb = new StringBuilder();
        while (rest > 0) {
            int diff = (rest - 1) % num;
            sb.append(f(diff));
            rest = (rest - 1) / num;
        }
        return sb.reverse().toString();
    }

    static char f(int n) {
        return (char) ('A' + n);
    }
}
