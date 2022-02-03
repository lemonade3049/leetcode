package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class CapitalizeTheTitle2129 {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 2) {
                StringBuilder sb = new StringBuilder();
                arr[i] = arr[i].toLowerCase();
                sb.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1));
                arr[i] = sb.toString();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }
        return String.join(" ", arr);
    }
}
