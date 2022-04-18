package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.ListNode;

@SuppressWarnings("unused")
public class LinkedListCycle141 {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
