package com.lemonade.leetcode.t1000.t600;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimumIndexSumOfTwoLists599 {
    static class P {
        String val;
        int index;

        P(String s, int i) {
            val = s;
            index = i;
        }
    }

    public static void main(String[] args) {
        new MinimumIndexSumOfTwoLists599().findRestaurant1(new String[]{"a", "b"}, new String[]{"b","a"});
    }
    public String[] findRestaurant1(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        PriorityQueue<P> p = new PriorityQueue<>((Comparator.comparingInt(o -> o.index)));

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                p.offer(new P(list2[i], map1.get(list2[i]) + i));
            }
        }

        int index =  p.peek().index;
        StringBuilder sb = new StringBuilder();

        while (!p.isEmpty() && p.peek().index == index) {
            P t = p.poll();
            sb.append(t.val).append("#");
        }
        String str = sb.toString();
        str = str.substring(0, str.length() - 1);

        return str.split("#");
    }
//
//    public String[] findRestaurant(String[] list1, String[] list2) {
//
//        int[]
//    }
}
