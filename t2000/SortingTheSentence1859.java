package com.lemonade.leetcode.t2000;

public class SortingTheSentence1859 {

    public static void main(String[] args) {
        new SortingTheSentence1859().sortSentence("is2 sentence4 This1 a3");
    }

    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i].charAt(arr[i].length() - 1) - '0' - 1] = arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = res[i].substring(0, res[i].length() - 1);
        }

        return String.join(" ", res);
    }
}
