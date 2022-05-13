package com.lemonade.leetcode.t1000.t100;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class LetterCombinationsOfAPhoneNumber17 {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new LinkedList<>();
        if("".equals(digits)){
            return ans;
        }
        char[][] map = new char[8][];
        map[0] = new char[]{'a', 'b', 'c'};
        map[1] = new char[]{'d', 'e', 'f'};
        map[2] = new char[]{'g', 'h', 'i'};
        map[3] = new char[]{'j', 'k', 'l'};
        map[4] = new char[]{'m', 'n', 'o'};
        map[5] = new char[]{'p', 'q', 'r', 's'};
        map[6] = new char[]{'t', 'u', 'v'};
        map[7] = new char[]{'w', 'x', 'y', 'z'};
        f(digits.toCharArray(), 0, new StringBuilder(), ans, map);
        return ans;
    }

    void f(char[] arr, int index, StringBuilder now, List<String> ans, char[][] map) {
        if (index == arr.length) {
            ans.add(String.valueOf(now));
            return;
        }
        char thisWord = arr[index];

        for (int i = 0; i < map[thisWord - '2'].length; i++) {
            StringBuilder newNow = now.append(map[thisWord - '2'][i]);
            f(arr, index + 1, newNow, ans, map);
            newNow.deleteCharAt(newNow.length() - 1);
        }
    }
}
