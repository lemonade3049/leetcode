package com.lemonade.leetcode.t1000.t500;

public class RemoveKDigits402 {

    public static void main(String[] args) {
        new RemoveKDigits402().removeKDigits("1234", 3);
    }

    public String removeKDigits(String num, int k) {
        int n = k;
        char[] arr = num.toCharArray();
        if (arr.length <= k) {
            return "0";
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 0 && i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                sb.append(arr[i]);
            } else {
                n--;
            }
            i++;
        }

        while (i < arr.length) {
            sb.append(arr[i++]);
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - n));
        i = 0;
        while(i < sb.length() - 1 && sb.substring(i, i + 1).equals("0")){
            i++;
        }
        sb = new StringBuilder(sb.substring(i));

        return sb.toString();

    }
}
