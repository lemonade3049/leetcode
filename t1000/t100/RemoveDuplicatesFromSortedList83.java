package com.lemonade.leetcode.t1000.t100;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class RemoveDuplicatesFromSortedList83 {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head != null) {
            ListNode p = head;
            ListNode n = head.next;
            while (n != null) {
                if (n.val != p.val) {
                    p = n;
                }
                n = n.next;
            }
            p.next = null;
        }
        return head;
    }
}



