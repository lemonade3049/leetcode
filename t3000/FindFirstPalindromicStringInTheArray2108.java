package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class FindFirstPalindromicStringInTheArray2108 {
    public String firstPalindrome(String[] words) {
        for(String str :words){
            if(f(str)){
                return str;
            }
        }
        return "";
    }

    boolean f(String str){
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i++] != arr[j--]){
                return false;
            }
        }
        return true;
    }
}
