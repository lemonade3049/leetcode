package com.lemonade.leetcode.t1000.t100;

public class ZigzagConversion6 {

    public static void main(String[] args) {
        System.out.println(new ZigzagConversion6().convert("PAYPALISHIRING", 1));
    }

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder res = new StringBuilder();

//        ( numRows) * (numRows - 1) / 2

        for (int j = 0; j < numRows; j++) {
            for (int i = j; i < s.length(); i = i + 2 * (numRows - 1)) {
                res.append(s.charAt(i));
                if (j != 0 && j != numRows- 1 && i + 2 * (numRows - 1 - j) < s.length()) {
                    res.append(s.charAt(i + 2 * (numRows - 1 - 1 * j)));
                }
            }
        }

        return res.toString();
    }
}
