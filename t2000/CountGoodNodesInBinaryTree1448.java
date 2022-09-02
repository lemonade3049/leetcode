package com.lemonade.leetcode.t2000;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class CountGoodNodesInBinaryTree1448 {

    private int result = 0;

    public int goodNodes(TreeNode root) {

        f(root, Integer.MIN_VALUE);
        return this.result;
    }

    private void f(TreeNode node, int max) {
        if (node.val >= max) {
            this.result++;
        }
        max = Math.max(max, node.val);
        if(node.left != null){
            f(node.left, max);
        }
        if(node.right != null){
            f(node.right, max);
        }
    }
}
