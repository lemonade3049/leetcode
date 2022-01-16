package com.lemonade.leetcode.t2000;

import java.util.Stack;

public class RemoveOutermostParentheses1021 {
    public String removeOuterParentheses(String s) {

        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                if (!stack.isEmpty()) {
                    sb.append(arr[i]);
                }
                stack.push(arr[i]);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    sb.append(arr[i]);
                }
            }
        }

        return sb.toString();
    }
}
