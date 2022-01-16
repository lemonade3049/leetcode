package com.lemonade.leetcode.t2000;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class BinarySearchTreeToGreaterSumTree1038 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        int num = 0;
        Stack<TreeNode> stack = new Stack<>();
        f(stack, root);
        while(!stack.isEmpty()){
            TreeNode t = stack.pop();
            t.val = t.val + num;
            num = t.val;
        }
        return root;
    }

    void f(Stack<TreeNode> stack, TreeNode t){
        if(t.left != null){
            f(stack, t.left);
        }
        stack.push(t);
        if(t.right != null){
            f(stack, t.right);
        }
    }
}
