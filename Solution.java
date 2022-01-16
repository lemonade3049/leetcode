package com.lemonade.leetcode;

import java.util.*;

class Solution {


    public static void main(String[] args) {

        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int total = 0;
        int res = 0;
        for (int i = 0; i < a; i++) {
            total |= sc.nextInt();
        }

        while((total & 1) == 0){
            total >>= 1;
            res++;
        }

        System.out.println(res);
    }
}
