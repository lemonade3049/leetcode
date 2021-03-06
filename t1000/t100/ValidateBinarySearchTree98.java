package com.lemonade.leetcode.t1000.t100;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class ValidateBinarySearchTree98 {
    Integer pre = null;
    boolean f(TreeNode t) {
        if (t == null) {
            return true;
        }
        boolean res = f(t.left);
        if(pre != null){
            res = res && pre < t.val;
        }
        pre = t.val;
        return res && f(t.right);

    }


    public boolean isValidBST2(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        f2(root, list);
        int pre = list.get(0).val;
        for (int i = 1; i < list.size(); i++) {
            int curr = list.get(i).val;
            if (curr <= pre) {
                return false;
            } else {
                pre = curr;
            }
        }
        return true;
    }

    void f2(TreeNode t, List<TreeNode> list) {
        if (t.left != null) {
            f2(t.left, list);
        }
        list.add(t);
        if (t.right != null) {
            f2(t.right, list);
        }
    }
}
