package com.lemonade.leetcode.t2000;

public class GreatestCommonDivisorOfStrings1071 {

    public static void main(String[] args) {

        // "OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO"
        //"OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO"
        System.out.println(gcdOfStrings("OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO", "OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO"));
        // System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String sub1 = shortestSubstr(str1);
        String sub2 = shortestSubstr(str2);
        if (!sub1.equals(sub2)) {
            return "";
        }
        int t = getHighestCommonFactor(str1.length() / sub1.length(), str2.length() / sub2.length());
        return sub1.repeat(Math.max(0, t));
    }

    static int getHighestCommonFactor(int i, int j) {
        int b = Math.max(i, j);
        int s = Math.min(i, j);

        while (true) {
            b = b % s;
            if (b == 0) {
                return s;
            }
            int temp = b;
            b = s;
            s = temp;
        }
    }

    static String shortestSubstr(String str) {
        char[] strArr = str.toCharArray();
        int len = 1;
        for (int j = 1; j < str.length(); j++) {
            if (strArr[j] != strArr[j - len]) {
                len++;
                j = len - 1;
            }
        }
        return str.substring(0, len);
    }
}
