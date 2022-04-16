package com.lemonade.leetcode.t1000.t900;

import java.util.HashSet;

@SuppressWarnings("unused")
public class UniqueMorseCodeWords804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            char[] wordsChars = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char wordsChar : wordsChars) {
                sb.append(arr[wordsChar - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
