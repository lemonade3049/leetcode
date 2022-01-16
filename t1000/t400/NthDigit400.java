package com.lemonade.leetcode.t1000.t400;

public class NthDigit400 {
    public static void main(String[] args) {
        for (int i = 10; i < 10000; i++) {
            if (findN(i) != findNthDigit(i)) {
                System.out.println("No");
                System.out.println(i);
                return;
            }
        }
        System.out.println(findN(10));
        System.out.println(findNthDigit(10));
    }

    public static int findN(int n) {
        String s = "";
        int i = 1;
        while (s.length() < n) {
            s += i;
            i++;
        }

        return s.charAt(n - 1) - '0';
    }

    public static int findNthDigit(int n) {
        int i = 1;
        int de = (int) (i * 9 * Math.pow(10, i - 1));
        while (de < n) {
            i++;
            n -= de;
            de = (int) (i * 9 * Math.pow(10, i - 1));
        }
        int target = (int) Math.pow(10, i - 1) + (n - 1) / i;
        return String.valueOf(target).charAt((n - 1) % i) - '0';
    }
}
