package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class LinkedListCycle2_142 {
    public ListNode hasCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }

        return null;
    }
}
