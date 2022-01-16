package com.lemonade.leetcode.t1000.t400;

public class RansomNote383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char[] ransomArr = ransomNote.toCharArray();
        char[] magArr = magazine.toCharArray();
        int[] arr = new int[26];


        for (int i = 0; i < magArr.length; i++) {
            arr[magArr[i] - 'a']++;
        }

        for (int i = 0; i < ransomArr.length; i++) {
            if (arr[ransomArr[i] - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
