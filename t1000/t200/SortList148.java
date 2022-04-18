package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
public class SortList148 {
    public ListNode sortList(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        list.sort(Comparator.comparingInt(o -> o));

        node = head;
        for (Integer integer : list) {
            node.val = integer;
            node = node.next;
        }

        return head;
    }
}
