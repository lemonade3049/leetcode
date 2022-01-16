package com.lemonade.leetcode.t1000.t400;

public class FindTheDifference389 {
    public char findTheDifference(String s, String t) {
        int[] arr =new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - '0']++;
        }
        for(int i = 0; i < t.length(); i++) {
            if (arr[t.charAt(i) - '0']-- == 0) {
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
