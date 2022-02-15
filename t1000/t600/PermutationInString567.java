package com.lemonade.leetcode.t1000.t600;

@SuppressWarnings("unused")
public class PermutationInString567 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] arr = new int[26];
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            arr[arr1[i] - 'a']++;
            arr[arr2[i] - 'a']--;
        }
        if (f(arr)) {
            return true;
        }
        for (int i = arr1.length; i < arr2.length; i++) {
            arr[arr2[i] - 'a']--;
            arr[arr2[i - arr1.length] - 'a']++;
            if (f(arr)) {
                return true;
            }
        }

        return false;
    }

    boolean f(int[] arr) {
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
