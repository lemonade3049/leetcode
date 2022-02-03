package com.lemonade.leetcode.t1000.t300;

public class HappyNumber202 {
    public static void main(String[] args) {
        for(int i= 1; i < 100; i++){
            System.out.println(isHappy(i));
        }
    }
    public static boolean isHappy(int n) {

        int[] arr = new int[1001];

        while(true){
            if(n < 1000){
                arr[n] = 1;
            }
            n = to(n);
            if(n == 1){
                return true;
            }
            if(arr[n] == 1){
                return false;
            }
        }
    }

    public static int to(int i) {
        String str = String.valueOf(i);
        int res = 0;
        for (int j = 0; j < str.length(); j++) {
            res += (str.charAt(j) - '0') * (str.charAt(j) - '0');
        }
        return res;
    }
}
