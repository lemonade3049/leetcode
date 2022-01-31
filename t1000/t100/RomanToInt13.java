package com.lemonade.leetcode.t1000.t100;
@SuppressWarnings("unused")
public class RomanToInt13 {


    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        if (s.length() < 1 || s.length() > 16) {
            return -1;
        }

        int res = 0;
        int temp = getNum(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char pre = s.charAt(i - 1);
            char cur = s.charAt(i);
            if (pre == cur) {
                temp += getNum(cur);
            } else if (getNum(pre) > getNum(cur)) {
                res += temp;
                temp = getNum(cur);
            } else {
                res -= temp;
                temp = getNum(cur);
            }
        }

        // ('I', 'V', 'X', 'L', 'C', 'D', 'M')
        return res + temp;
    }

    public static int getNum(char i) {
        return switch (i) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
