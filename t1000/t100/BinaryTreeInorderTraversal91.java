package com.lemonade.leetcode.t1000.t100;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class BinaryTreeInorderTraversal91 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        f(root, list);
        return list;
    }

    void f(TreeNode n, List<Integer> list) {

        if (n == null) {
            return;
        }

        f(n.left, list);
        list.add(n.val);
        f(n.right, list);
    }
}
