package com.lemonade.leetcode.t1000.t200;

@SuppressWarnings("unused")
public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return f(root, targetSum);
    }

    boolean f(TreeNode n, int restSum) {
        if (n.left == null && n.right == null) {
            return restSum == n.val;
        } else if (n.right == null) {
            return f(n.left, restSum - n.val);
        } else if (n.left == null) {
            return f(n.right, restSum - n.val);
        }
        return f(n.left, restSum - n.val) || f(n.right, restSum - n.val);
    }
}
