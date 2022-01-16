package com.lemonade.leetcode.t1000.t100;

public class PalindromeNumber9 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x){
        String str = String.valueOf(x);
        for(int i = 0, j = str.length() - 1; i <j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
