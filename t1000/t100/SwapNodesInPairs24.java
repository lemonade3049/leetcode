package com.lemonade.leetcode.t1000.t100;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class SwapNodesInPairs24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode first = head;
        ListNode second = head.next;
        head = second;
        while (first != null && first.next != null) {
            second = first.next;
            if (pre != null) {
                pre.next = second;
            }
            first.next = second.next;
            second.next = first;
            pre = first;
            first = first.next;
        }
        return head;
    }
}
