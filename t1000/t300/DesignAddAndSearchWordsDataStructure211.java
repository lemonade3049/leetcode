package com.lemonade.leetcode.t1000.t300;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class DesignAddAndSearchWordsDataStructure211 {
    static class WordDictionary {
        Set<String> set;

        public WordDictionary() {
            set = new HashSet<>();
        }

        public void addWord(String word) {
            set.add(word);
            addOneDot(word);
        }

        private void addOneDot(String word) {
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    for (int k = j; k < arr.length; k++) {
                        StringBuilder sb = new StringBuilder();
                        for (int l = 0; l < arr.length; l++) {
                            if (l == i || l == j || l == k) {
                                sb.append('.');
                            } else {
                                sb.append(arr[l]);
                            }
                        }
                        set.add(sb.toString());
                    }
                }
            }
        }

        public boolean search(String word) {
            return set.contains(word);
        }
    }
}
