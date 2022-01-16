package com.lemonade.leetcode.t1000.t200;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();

        f(root, list);
        return list;
    }

    public void f(TreeNode n, List<Integer> list){

        if(n == null){
            return;
        }
        list.add(n.val);
        f(n.left, list);
        f(n.right, list);
    }
}
