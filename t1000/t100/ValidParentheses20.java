package com.lemonade.leetcode.t1000.t100;

import java.util.Stack;
@SuppressWarnings("unused")
public class ValidParentheses20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char tc = stack.pop();
                if (!((tc == '(' && c == ')') ||
                        (tc == '[' && c == ']') ||
                        (tc == '{' && c == '}'))) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
