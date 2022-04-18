package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class IntersectionOfTwoLinkedLists160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int i = 0;
        ListNode lA = headA;
        ListNode lB = headB;
        while (lA.next != null) {
            lA = lA.next;
            i++;
        }
        while (lB.next != null) {
            lB = lB.next;
            i--;
        }
        if (lA != lB) {
            return null;
        }

        lA = headA;
        lB = headB;

        if (i > 0) {
            for (int j = 0; j < i; j++) {
                assert lA != null;
                lA = lA.next;
            }
        } else {
            for (int j = 0; j > i; j--) {
                assert lB != null;
                lB = lB.next;
            }
        }

        while (lA != lB) {
            assert lA != null;
            lA = lA.next;
            assert lB != null;
            lB = lB.next;
        }
        return lA;
    }
}
