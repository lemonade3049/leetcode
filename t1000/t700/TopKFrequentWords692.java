package com.lemonade.leetcode.t1000.t700;

import java.util.*;

public class TopKFrequentWords692 {

    class WordFrequency implements Comparable<WordFrequency> {
        String word;
        int frequency;

        WordFrequency(String w, int f) {
            word = w;
            frequency = f;
        }

        @Override
        public int compareTo(WordFrequency o) {
            if (o.frequency != this.frequency)
                return o.frequency - this.frequency;
            return this.word.compareTo(o.word);
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<WordFrequency> p = new PriorityQueue<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            p.offer(new WordFrequency(item.getKey(), item.getValue()));
        }
        List<String> list = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            list.add(p.poll().word);
        }

        return list;
    }
}
