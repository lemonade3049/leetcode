package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class BinaryTreePreorderTraversal144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();

        f(root, list);
        return list;
    }

    public void f(TreeNode n, List<Integer> list) {

        if (n == null) {
            return;
        }
        list.add(n.val);
        f(n.left, list);
        f(n.right, list);
    }
}
