package com.lemonade.leetcode.t1000.t100;

public class ClimbingStairs70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int pre = 1;
        int next = 2;
        int c = 1;
        while(++c < n){
            int temp = next;
            next += pre;
            pre = temp;
        }

        return next;
    }
}
