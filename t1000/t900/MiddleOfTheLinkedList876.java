package com.lemonade.leetcode.t1000.t900;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class MiddleOfTheLinkedList876 {

    public ListNode middleNode(ListNode head) {

        ListNode n1 = head;
        ListNode n2 = head;
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next;
            if (n2.next != null) {
                n2 = n2.next;
            }
        }

        return n1;
    }
}
