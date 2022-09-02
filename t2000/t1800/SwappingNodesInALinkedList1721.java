package com.lemonade.leetcode.t2000.t1800;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class SwappingNodesInALinkedList1721 {

    public ListNode swapNodes(ListNode head, int k) {

        ListNode h1 = head;
        int num = 0;
        while (h1 != null) {
            h1 = h1.next;
            num++;
        }

        k = Math.min(k - 1, num - k);

        h1 = head;
        for (int i = 0; i < k; i++) {
            h1 = h1.next;
        }
        ListNode h2 = h1;
        for (int i = k; i < num - k - 1; i++) {
            h2 = h2.next;
        }
        int t = h1.val;
        h1.val = h2.val;
        h2.val = t;
        return head;
    }
}