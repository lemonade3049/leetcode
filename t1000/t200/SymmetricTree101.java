package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        return f(root.left, root.right);
    }

    private boolean f(TreeNode l, TreeNode r) {
        if (l != null && r != null) {
            return l.val == r.val && f(l.left, r.right) && f(l.right, r.left);
        } else return l == null && r == null;
    }
}
