package com.lemonade.leetcode.t1000.t100;

import java.sql.Array;
import java.util.HashMap;

public class RomanToInt13 {


    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        if (s.length() < 1 || s.length() > 16) {
            return -1;
        }
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);

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
        switch (i) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
