package com.lemonade.leetcode.t2000;

@SuppressWarnings("unused")
public class CheckIfStringIsAPrefixOfArray1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (sb.length() < s.length() && index < words.length) {
            sb.append(words[index++]);
        }

        return s.equals(sb.toString());
    }
}
