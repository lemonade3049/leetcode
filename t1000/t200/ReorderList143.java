package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.ListNode;

public class ReorderList143 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        reorderList(node);
    }

    public static void reorderList(ListNode head) {
        if (head.next == null) {
            return;
        }
        ListNode mid = findMid(head);
        ListNode n2 = reverseList(mid.next);
        mid.next = null;

        ListNode n22 = n2.next;
        ListNode n1 = head;
        ListNode n12 = n1.next;

        while (n22 != null) {
            n1.next = n2;
            n2.next = n12;
            n1 = n12;
            n2 = n22;
            n12 = n1.next;
            n22 = n2.next;
        }

        n1.next = n2;

    }

    public static ListNode findMid(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f.next != null && f.next.next != null) {
            f = f.next.next;
            s = s.next;
        }

        return s;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            ListNode n = head.next;
            n.next = head;
            head.next = null;
            return n;
        }
        ListNode n1 = head;
        ListNode n2 = head.next;
        ListNode n3 = n2.next;
        head.next = null;
        while (n3 != null) {
            n2.next = n1;
            n1 = n2;
            n2 = n3;
            n3 = n3.next;
        }
        n2.next = n1;

        return n2;
    }
}
