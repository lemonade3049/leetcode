package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class CountAndSay38 {

    public String countAndSay(int n) {
        String res = "1";
        for (int i = 0; i < n; i++) {
            res = f(res);
        }
        return res;
    }

    String f(String s) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        char t = arr[0];
        int num = 1;

        for (int i = 1; i < arr.length; i++) {
            if (t == arr[i]) {
                num++;
            } else {
                sb.append(num);
                sb.append(t);
                t = arr[i];
                num = 1;
            }
        }
        sb.append(num);
        sb.append(t);
        return sb.toString();
    }
}
