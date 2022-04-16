package com.lemonade.leetcode.t1000.t800;

import java.util.HashMap;

@SuppressWarnings("unused")
public class JewelsAndStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] jewelsArr = jewels.toCharArray();
        for (char c : jewelsArr) {
            map.put(c, 0);
        }
        int res = 0;
        char[] stonesArr = stones.toCharArray();
        for (char c : stonesArr) {
            if (map.containsKey(c)) {
                res++;
            }
        }
        return res;
    }
}
