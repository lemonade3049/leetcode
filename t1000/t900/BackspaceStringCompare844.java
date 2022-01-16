package com.lemonade.leetcode.t1000.t900;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BackspaceStringCompare844 {
    public boolean backspaceCompare(String s, String t) {

        Stack s1 = new Stack<>();
        Stack s2 = new Stack<>();

        char[] sArr1 = s.toCharArray();
        char[] sArr2 = t.toCharArray();
        for (int i = 0; i < sArr1.length; i++) {
            if (sArr1[i] == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(sArr1[i]);
            }
        }
        for (int i = 0; i < sArr2.length; i++) {
            if (sArr2[i] == '#') {
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            } else {
                s2.push(sArr2[i]);
            }
        }

        while (!s1.isEmpty() && !s2.isEmpty()) {
            if (s1.pop() != s2.pop()) {
                return false;
            }
        }
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
