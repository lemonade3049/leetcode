package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.Node;

@SuppressWarnings("unused")
public class PopulatingNextRightPointersInEachNodeII117 {

    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        f(root);
        return root;
    }

    private void f(Node n) {
        if(n == null){
            return;
        }

        if(n.left != null){
            if(n.right == null){
                n.left.next = findNext(n);
            }else{
                n.left.next = n.right;
            }
        }

        if(n.right != null){
            n.right.next = findNext(n);
        }
        f(n.right);
        f(n.left);
    }

    private Node findNext(Node n) {
        while(n.next != null){
            n = n.next;
            if(n.left != null){
                return n.left;
            }
            if(n.right != null){
                return n.right;
            }
        }
        return null;
    }
}
