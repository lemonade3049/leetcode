package com.lemonade.leetcode.t1000.t300;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i)) && !map2.containsKey(arr[i])) {
                map.put(pattern.charAt(i), arr[i]);
                map2.put(arr[i], pattern.charAt(i));
            } else if (map.containsKey(pattern.charAt(i)) && map2.containsKey(arr[i])) {
                if (!map.get(pattern.charAt(i)).equals(arr[i]) && map2.get(arr[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
