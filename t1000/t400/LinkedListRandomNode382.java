package com.lemonade.leetcode.t1000.t400;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode382 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        List<ListNode> list = null;
        Random random = new Random();
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
