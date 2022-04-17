package com.lemonade.leetcode.t1000.t800;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class InsertIntoABinarySearchTree701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        TreeNode t = root;
        while (true) {
            if (t.val > val) {
                if (t.left != null) {
                    t = t.left;
                } else {
                    t.left = new TreeNode(val);
                    break;
                }
            } else {
                if (t.right != null) {
                    t = t.right;
                } else {
                    t.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}