package com.lemonade.leetcode.t1000.t900;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class AllPossibleFullBinaryTrees894 {


    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> list = new ArrayList<>();
        if ((n & 1) == 0) {
            return list;
        }
        for (int i = 1; i < n; i = i + 2) {

        }
        return null;
    }

    List<TreeNode> f(int n) {
        List<TreeNode> list = new ArrayList<>();
        TreeNode node = new TreeNode(0);
        return null;
    }
}
