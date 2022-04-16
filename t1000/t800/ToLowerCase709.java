package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class ToLowerCase709 {

    public static void main(String[] args) {
        System.out.println(new ToLowerCase709().toLowerCase("AseaweAFasg"));
    }

    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }

        return String.valueOf(chars);
    }
}
