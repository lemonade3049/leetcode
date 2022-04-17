package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        return f(root);
    }

    int f(TreeNode n) {
        if (n == null) {
            return 0;
        } else {
            return Math.max(f(n.left), f(n.right)) + 1;
        }

    }
}
