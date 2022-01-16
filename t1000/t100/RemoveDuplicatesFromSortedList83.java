package com.lemonade.leetcode.t1000.t100;

public class RemoveDuplicatesFromSortedList83 {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head != null) {
            ListNode p = head;
            ListNode n = head.next;
            while (n != null) {
                if (n.val == p.val) {
                    n = n.next;
                } else {
                    p.next = n;
                    p = n;
                    n = n.next;
                }
            }
            p.next = n;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



