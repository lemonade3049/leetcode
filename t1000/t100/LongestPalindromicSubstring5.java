package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class LongestPalindromicSubstring5 {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring5().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        String str = changeToPalindromeString(s);
        int R = -1;
        int C = -1;
        int length = str.length();
        int[] pArr = new int[length];
        for (int i = 0; i < length; i++) {
            int diff = 0;
            if (i < R) {
                diff = Math.min(R - i, pArr[2 * C - i]);
            }
            while (i - diff >= 0 && i + diff < length && str.charAt(i - diff) == str.charAt(i + diff)) {
                diff++;
            }
            if (diff + i > R) {
                R = diff + i;
                C = i;
            }
            pArr[i] = diff;
        }
        int maxIndex = 0;
        int maxLength = 0;
        for (int i = 0; i < length; i++) {
            if(pArr[i] > maxLength){
                maxIndex = i;
                maxLength = pArr[i];
            }
        }

        return str.substring(maxIndex - maxLength + 1,maxIndex + maxLength - 1).replace("#", "");
    }

    private String changeToPalindromeString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char aChar : chars) {
            sb.append(aChar);
            sb.append('#');
        }
        return sb.toString();
    }

    public String longestPalindrome1(String s) {
        int max = 0;

        String s1 = changeToPalindromeString(s);
        int res = -1;
        for (int i = 0; i < s1.length(); i++) {
            int j = 1;
            while (i - j >= 0 && i + j < s1.length() && s1.charAt(i - j) == s1.charAt(i + j)) {
                j++;
            }
            if (j > max) {
                max = j;
                res = i;
            }
        }
        return s1.substring((res - max + 1), (res + max)).replace("#", "");
    }
}
