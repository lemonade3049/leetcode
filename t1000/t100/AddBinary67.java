package com.lemonade.leetcode.t1000.t100;

public class AddBinary67 {

    public static void main(String[] args) {
        System.out.println(new AddBinary67().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int lenA = aArr.length;
        int lenB = bArr.length;

        int res[] = new int[Math.max(lenA, lenB) + 1];


        int i = lenA - 1;
        int j = lenB - 1;
        int k = res.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            res[k] = carry;
            if (i >= 0) {
                res[k] += (aArr[i] - '0');
            }
            if (j >= 0) {
                res[k] += (bArr[j] - '0');
            }
            carry = res[k] / 2;
            res[k] = res[k] % 2;
            k--;
            i--;
            j--;
        }
        res[k] = carry;

        StringBuilder sb = new StringBuilder();

        if (res[0] == 1) {
            sb.append(1);
        }
        for (int l = 1; l < res.length; l++) {
            sb.append(res[l]);
        }
        return sb.toString();
    }
}
