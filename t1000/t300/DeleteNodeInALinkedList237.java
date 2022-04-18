package com.lemonade.leetcode.t1000.t300;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class DeleteNodeInALinkedList237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode next = node.next;

        node.next = next.next;
        next.next = null;
    }
}
