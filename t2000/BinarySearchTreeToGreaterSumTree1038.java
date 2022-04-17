package com.lemonade.leetcode.t2000;

import com.lemonade.leetcode.common.TreeNode;

import java.util.Stack;

@SuppressWarnings("unused")
public class BinarySearchTreeToGreaterSumTree1038 {

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
