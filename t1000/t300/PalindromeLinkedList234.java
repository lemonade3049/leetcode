package com.lemonade.leetcode.t1000.t300;

import com.lemonade.leetcode.common.ListNode;

import java.util.Stack;

// so slow.. don't know why
// reverse from the middle could be O(1) space

@SuppressWarnings("unused")
public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode n = head;
        int s = 0;
        while (n != null) {
            stack.push(n.val);
            n = n.next;
            s++;
        }
        n = head;
        s >>>= 1;
        while (s-- > 0) {
            if (stack.pop() == n.val) {
                n = n.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
