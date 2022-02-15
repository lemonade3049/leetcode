package com.lemonade.leetcode.t1000.t200;

import java.util.*;

public class WordLadder127 {

    List<List<Integer>> edges = null;


    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        int res = new WordLadder127().ladderLength("a", "c", list);
        System.out.println(res);
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int endIndex = -1;
        int startIndex = -1;
        for (int i = 0; i < wordList.size(); i++) {
            if (endWord.equals(wordList.get(i))) {
                endIndex = i;
            }
            if (beginWord.equals(wordList.get(i))) {
                startIndex = i;
            }
        }
        if (endIndex == -1) {
            return 0;
        }

        edges = new ArrayList<>(wordList.size() + 1);

        for (int i = 0; i < wordList.size() + 1; i++) {
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (check(beginWord, wordList.get(i))) {
                edges.get(wordList.size()).add(i);
            }
        }
        if (edges.get(wordList.size()).size() == 0) {
            return 0;
        }

        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < wordList.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (check(wordList.get(i), wordList.get(j))) {
                    edges.get(i).add(j);
                }
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < edges.get(wordList.size()).size(); i++) {
            queue.offer(new int[]{edges.get(wordList.size()).get(i), 2});
            set.add(edges.get(wordList.size()).get(i));

        }
        if (startIndex != -1) {
            set.add(startIndex);
        }
        while (!queue.isEmpty()) {
            int[] t = queue.poll();
            if (t[0] == endIndex) {
                return t[1];
            }
            for (int i = 0; i < edges.get(t[0]).size(); i++) {
                int nextPoint = edges.get(t[0]).get(i);
                if (!set.contains(nextPoint)) {
                    set.add(nextPoint);
                    queue.offer(new int[]{nextPoint, t[1] + 1});
                }
            }
        }
        return 0;
    }

    boolean check(String s1, String s2) {
        int res = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                res++;
            }
        }
        return res == 1;
    }
}
