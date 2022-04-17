package com.lemonade.leetcode.t1000.t600;


import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class ConvertBSTToGreaterTree538 {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        f(root);
        return root;
    }

    private void f(TreeNode root) {
        if (root == null) {
            return;
        }

        f(root.right);
        sum += root.val;
        root.val = sum;
        f(root.left);
    }
}

