package com.lemonade.leetcode.t1000.t300;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class RemoveLinkedListElements203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode pre;
        ListNode next = head;
        while (next != null && next.val == val) {
            next = next.next;
        }
        head = next;
        pre = next;
        if (pre == null) {
            return null;
        } else {
            next = pre.next;
        }
        while (next != null) {
            if (next.val == val) {
                pre.next = null;
                next = next.next;
            } else {
                pre.next = next;
                pre = pre.next;
                next = pre.next;
            }
        }
        return head;
    }
}
