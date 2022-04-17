package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class ShortestCompletingWord748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] plateFrequency = new int[26];

        char[] chars = licensePlate.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z') {
                plateFrequency[aChar - 'a']++;
            } else if (aChar >= 'A' && aChar <= 'Z') {
                plateFrequency[aChar - 'A']++;
            }
        }
        int minLength = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            int[] tempFrequency = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                tempFrequency[words[i].charAt(j) - 'a']++;
            }
            if (f(plateFrequency, tempFrequency)) {
                if (words[i].length() < minLength) {
                    minLength = words[i].length();
                    index = i;
                }
            }

        }
        return words[index];
    }

    private boolean f(int[] plateFrequency, int[] tempFrequency) {
        for (int i = 0; i < 26; i++) {
            if (plateFrequency[i] > tempFrequency[i]) {
                return false;
            }
        }
        return true;
    }
}
