package com.lemonade.leetcode.t1000.t100;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class MergeTwoLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode res = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                res.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                res.next = new ListNode(list1.val);
                list1 = list1.next;
            }
        }
        while (list1 != null) {
            res.next = new ListNode(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            res.next = new ListNode(list2.val);
            list2 = list2.next;
        }

        res = head.next;
        head.next = null;
        return res;
    }

    public ListNode mergeTwoLists_2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode rPre, rNext, tPre, tNext;

        if (list1.val > list2.val) {
            rPre = list2;
            rNext = list2.next;
            tPre = list1;
            tNext = list1.next;
        } else {
            rPre = list1;
            rNext = list1.next;
            tPre = list2;
            tNext = list2.next;
        }

        ListNode rtnNode = rPre;

        while (rNext != null && tPre != null) {
            if (rNext.val > tPre.val) {
                rPre.next = tPre;
                tPre.next = rNext;
                rPre = rPre.next;
                tPre = tNext;
                tNext = tNext == null ? null : tNext.next;
            } else {
                rPre = rPre.next;
                rNext = rNext.next;
            }
        }
        if (rNext == null) {
            rPre.next = tPre;
        }
        return rtnNode;
    }
}
