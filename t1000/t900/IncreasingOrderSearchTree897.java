package com.lemonade.leetcode.t1000.t900;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class IncreasingOrderSearchTree897 {

    public TreeNode increasingBST(TreeNode root) {

        if(root == null){
            return null;
        }
        List<Integer> list = new ArrayList<>(100);
        f(root, list);
        TreeNode newRoot = new TreeNode(list.get(0));
        TreeNode currNode = newRoot;
        for (int i = 1; i < list.size(); i++) {
            currNode.right = new TreeNode(list.get(i));
            currNode = currNode.right;
        }

        return newRoot;
    }

    private void f(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        f(root.left, list);
        list.add(root.val);
        f(root.right, list);
    }
}
