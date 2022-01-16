package com.lemonade.leetcode.t1000.t1000;

public class StringWithoutAAAOrBBB984 {
    public static void main(String[] args) {
        System.out.println(new StringWithoutAAAOrBBB984().strWithout3a3b(4, 1));
    }

    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        while (a != b && a != 0 && b != 0) {
            if (a > b) {
                sb.append("aab");
                a -= 2;
                b--;
            } else {
                sb.append("bba");
                b -= 2;
                a--;
            }
        }
        if (a == b) {
            for (int i = 0; i < a; i++) {
                sb.append("ab");
            }
        } else {
            while (a != 0) {
                sb.append("a");
                a--;
            }
            while (b != 0) {
                sb.append("b");
                b--;
            }
        }

        return sb.toString();
    }
}
