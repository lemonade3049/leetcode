package com.lemonade.leetcode.t1000.t300;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class ReverseLinkedList206 {

    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
