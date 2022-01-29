package com.lemonade.leetcode.t1000.t100;

public class DecodeWays91 {
    public static void main(String[] args) {
        new DecodeWays91().numDecodings("11106");
    }

    public int numDecodings(String s) {

        char[] arr = s.toCharArray();
        int[] res = new int[arr.length];

        if (arr[0] == '0') {
            return 0;
        }
        if (arr.length == 1) {
            return 1;
        }
        if (arr[res.length - 1] != '0') {
            res[arr.length - 1] = 1;
        }
        if (arr[res.length - 2] != '0') {
            res[arr.length - 2] = res[arr.length - 1];
        }
        if ((arr[res.length - 2] < '2' && arr[res.length - 2] > '0') || (arr[res.length - 2] == '2' && arr[res.length - 1] < '7')) {
            res[res.length - 2] += 1;
        }
        for (int i = res.length - 3; i >= 0; i--) {
            if (arr[i] != '0') {
                res[i] = res[i + 1];
            }
            if ((arr[i] < '2' && arr[i] > '0') || (arr[i] == '2' && arr[i + 1] < '7')) {
                res[i] += res[i + 2];
            }
        }
        return res[0];

    }
}
