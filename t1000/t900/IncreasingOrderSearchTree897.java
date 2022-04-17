package com.lemonade.leetcode.t1000.t900;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class IncreasingOrderSearchTree897 {

    public TreeNode increasingBST(TreeNode root) {

        TreeNode tNode = f(root, null);


        return tNode;
    }

    private TreeNode f(TreeNode root, TreeNode currNode) {
        if (root == null) {
            return null;
        }
        currNode = f(root.left, currNode);
        currNode = new TreeNode(currNode.val);
        currNode = currNode.right;
        f(root.right, currNode);
        return root;
    }
}
