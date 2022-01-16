package com.lemonade.leetcode.t1000.t200;

import java.util.List;

public class PalindromePartitioning131 {

    public static void main(String[] args) {
        partition("aab");

    }
    public static List<List<String>> partition(String s) {
        char[] sArr = new char[s.length()*2 + 1];


        for(int i = 0; i < sArr.length; i++){
            if(i%2==1){
                sArr[i] = s.charAt( i / 2);
            }else{
                sArr[i] = '#';
            }
        }

        int[] arr = new int[s.length() * 2 + 1];
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            while( i - j >= 0 && i + j <arr.length && sArr[i - j] == sArr[i+j]){

                j++;
                arr[i]++;
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
        return null;
    }
}
