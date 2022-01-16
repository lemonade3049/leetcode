package com.lemonade.leetcode;

public class Multi {

    public static void main(String[] args) {
        System.out.printf("%x\n", -1);
    }

    public static  int multi(int i, int j){
        int res = 0;

        while(j != 0){
            if((j & 1) != 0){
                res = res + i;
            }
            i <<= 1;
            j>>>=1;
        }

        return res;
    }
}
