package com.lemonade.leetcode.t1000.t400;

import com.lemonade.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("unused")
public class LinkedListRandomNode382 {

    static class Solution {
        List<ListNode> list;
        Random random;
        public Solution(ListNode head) {
            ListNode n = head;
            list = new ArrayList<>();
            while (n != null) {
                list.add(n);
                n = n.next;
            }
            random = new Random(list.size());
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size())).val;
        }
    }
}
