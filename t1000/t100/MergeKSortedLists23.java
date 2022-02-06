package com.lemonade.leetcode.t1000.t100;

import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("unused")

public class MergeKSortedLists23 {
    static class ListNode {
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

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> p = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode list : lists) {
            if (list != null) {
                p.offer(list);
            }
        }
        ListNode node = new ListNode();
        ListNode curr = node;
        while (!p.isEmpty()) {
            ListNode n = p.poll();
            curr.next = new ListNode(n.val);
            if (n.next != null) {
                n = n.next;
                p.offer(n);
            }
            curr = curr.next;
        }
        return node.next;
    }

}
