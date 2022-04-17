package com.lemonade.leetcode.t2000;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("unused")
public class AllElementsInTwoBinarySearchTrees1305 {



    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        pushTreeNode(root1, s1);
        pushTreeNode(root2, s2);

        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.peek().val > s2.peek().val){
                TreeNode t = s2.pop();
                list.add(t.val);
                pushTreeNode(t.right, s2);
            }else{
                TreeNode t = s1.pop();
                list.add(t.val);
                pushTreeNode(t.right, s1);
            }
        }

        while(!s1.isEmpty()){
            TreeNode t = s1.pop();
            list.add(t.val);
            pushTreeNode(t.right, s1);
        }

        while(!s2.isEmpty()){
            TreeNode t = s2.pop();
            list.add(t.val);
            pushTreeNode(t.right, s2);
        }
        return list;
    }

    void pushTreeNode(TreeNode t, Stack<TreeNode> s){
        while (t != null){
            s.push(t);
            t = t.left;
        }
    }

}
