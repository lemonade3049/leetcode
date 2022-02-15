package com.lemonade.leetcode.t1000.t300;

public class AddDigits258 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        AddDigits258 obj = new AddDigits258();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int a1 = obj.addDigits(i);
            int a2 = obj.addDigits1(i);
            if (a1 != a2) {
                System.out.println(i + " " + a1 + " " + a2);
            }
        }
        System.out.println(System.currentTimeMillis());
    }

    public int addDigits(int num) {
        int res = f(num);
        while (res >= 10) {
            res = f(res);
        }
        return res;
    }

    int f(int v) {
        int res = 0;
        while (v > 0) {
            res += v % 10;
            v /= 10;
        }
        return res;
    }

    public int addDigits1(int n) {
        return n == 0 ? 0 : (n - 1) % 9 + 1;
    }

}
