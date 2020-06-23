package net.manishgiri.easy.binarytreebranchsum;

import java.util.ArrayList;
import java.util.List;

class Program {
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> al = new ArrayList<>();
        sumHelper(root, 0, al);
        System.out.println(al);
        return al;
    }

    private static void sumHelper(BinaryTree root, int val, List<Integer> al) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            al.add(root.value+val);
            return;
        }
        else {
            sumHelper(root.left, root.value + val , al);
            sumHelper(root.right, root.value + val, al);
        }
    }
}
