package com.lemonade.leetcode.t1000.t100;

import java.util.Arrays;
import java.util.SplittableRandom;

public class ReverseInteger7 {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("-0001"));
    }

    public int reverse(int x) {
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        boolean negFlag = false;
        if (arr[0] == '-') {
            negFlag = true;
        }
        int i = negFlag ? 1 : 0;
        int j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        String res = new String(arr);

        if(negFlag && res.length() == 11 && res.compareTo(String.valueOf(Integer.MIN_VALUE)) > 0){
            return 0;
        }
        if(!negFlag && res.length() == 10 && res.compareTo(String.valueOf(Integer.MAX_VALUE)) > 0){
            return 0;
        }
        return Integer.valueOf(res);

    }

    void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
