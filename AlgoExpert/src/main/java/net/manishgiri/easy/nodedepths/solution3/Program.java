package net.manishgiri.easy.nodedepths.solution3;

import java.util.ArrayDeque;

class Program {

    /**
     * Iterative approach - uses a Stack (AD)  and a custom data structure (Pair)
     * to hold an instaance of a Node and its corresponding depth in the tree
     * @param root
     * @return
     */
    static int nodeDepths(BinaryTree root) {
        // Write your code here.
        int depthSum = 0;
        ArrayDeque<Pair> stack = new ArrayDeque<>();
        stack.push(new Pair(root, 0));

        while(!stack.isEmpty()) {
            Pair p = stack.pop();
            depthSum += p.depth;
            // push left and right child
            if(p.node.left != null)
                stack.push(new Pair(p.node.left, p.depth+1));
            if(p.node.right != null)
                stack.push(new Pair(p.node.right, p.depth+1));

        }
        return depthSum;
    }

    static class Pair {
        BinaryTree node;
        int depth;

        Pair(BinaryTree node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
