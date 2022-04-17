package com.lemonade.leetcode.t2000;

public class CountVowelsPermutation1220 {


    public static void main(String[] args) {
        System.out.println(new CountVowelsPermutation1220().countVowelPermutation(45));
    }

    public int countVowelPermutation(int n) {
        int[] a = new int[5];
        int[] b = new int[5];
        int modulo = 1000000007;
        for (int i = 0; i < 5; i++) {
            a[i] = 1;
        }

        while (--n > 0) {

            for (int i = 0; i < 5; i++) {
                if(a[i] < 0){
                    System.out.println(1);
                }
                b[i] = a[i];
            }
            a[0] = (b[1] + b[2]) % modulo;
            a[0] = (a[0] + b[4]) % modulo;
            a[1] = (b[0] + b[2]) % modulo;
            a[2] = (b[1] + b[3]) % modulo;
            a[3] = (b[2]) % modulo;
            a[4] = (b[2] + b[3]) % modulo;
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = (a[i] + sum) % modulo;
        }
        return sum;
    }
}
