package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class MaximumNumberOfWordsFoundInSentences2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String str : sentences) {
            max = Math.max(max, str.split(" ").length);
        }
        return max;
    }
}
