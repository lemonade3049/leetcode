package com.lemonade.leetcode.t2000.t1400;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class DeleteLeavesWithAGivenValue1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (f(root, target)) {
            root = null;
        }
        return root;
    }

    boolean f(TreeNode n, int target) {


        if (n.left != null && f(n.left, target)) {
            n.left = null;
        }

        if (n.right != null && f(n.right, target)) {
            n.right = null;
        }

        return n.left == null && n.right == null && n.val == target;
    }

}
