package net.manishgiri.easy.nodedepths.solution2;

/**
 * Algoexpert's recursive solution
 */
class Program {
    static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return depthHelper(root, 0);
    }

    private static int depthHelper(BinaryTree node, int depth) {
        if(node == null) return 0;
        return depth + depthHelper(node.left, depth+1) + depthHelper(node.right, depth+1);
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
