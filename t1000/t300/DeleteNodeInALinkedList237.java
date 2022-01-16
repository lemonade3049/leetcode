package com.lemonade.leetcode.t1000.t300;

public class DeleteNodeInALinkedList237 {
    class ListNode {
        int val;
        ListNode next;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode next = node.next;

        node.next = next.next;
        next.next = null;
    }
}
