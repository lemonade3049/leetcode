package com.lemonade.leetcode.t3000;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class CountCommonWordsWithOneOccurrence2085 {

    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        int res = 0;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if(entry.getValue() == 1 && map2.getOrDefault(entry.getKey(), 0) == 1){
                res++;
            }
        }
        return res;
    }
}
