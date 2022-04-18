package com.lemonade.leetcode.t3000;

import com.lemonade.leetcode.common.ListNode;

import java.util.Stack;

@SuppressWarnings("unused")
public class MaximumTwinSumOfALinkedList2130 {

    public int pairSum(ListNode head) {
        ListNode n = head;
        Stack<ListNode> stack = new Stack<>();
        int sum = 0;

        while (n != null) {
            stack.push(n);
            n = n.next;
            sum++;
        }

        int max = 0;
        n = head;
        for (int i = 0; i < sum / 2; i++) {
            max = Math.max(n.val + stack.pop().val, max);
            n = n.next;
        }

        return max;
    }
}
