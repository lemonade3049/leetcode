package com.lemonade.leetcode.t1000.t700;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class TwoSumIVInputIsABST653 {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> integers = treeNodeToArray(root);
        for (int i = 0, j = integers.size() - 1; i < j; ) {
            if (integers.get(i) + integers.get(j) == k) {
                return true;
            } else if (integers.get(i) + integers.get(j) < k) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    private List<Integer> treeNodeToArray(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        f(root, list);
        return list;
    }

    private void f(TreeNode n, List<Integer> list) {
        if (n == null) {
            return;
        }
        f(n.left, list);
        list.add(n.val);
        f(n.right, list);
    }


//    public boolean findTarget(TreeNode root, int k) {
//        return f(root.left, root, k) || f(root, root.right, k);
//    }
//
//    private boolean f(TreeNode n1, TreeNode n2, int k) {
//        if (n1 == null || n2 == null) {
//            return false;
//        }
//        if (n1 == n2) {
//            return f(n1.left, n2, k) || f(n1, n2.right, k);
//        }
//
//        if (n1.val + n2.val == k) {
//            return true;
//        } else if (n1.val + n2.val > k) {
//            return f(n1.left, n2, k) || f(n1, n2.left, k);
//        } else {
//            return f(n1.right, n2, k) || f(n1, n2.right, k);
//        }
//    }

}
