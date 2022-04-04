package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class CountingWordsWithAGivenPrefix2185 {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(pref) == 0){
                res++;
            }
        }

        return res;
    }
}
