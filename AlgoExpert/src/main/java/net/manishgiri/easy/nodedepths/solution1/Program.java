package net.manishgiri.easy.nodedepths.solution1;

/**
 * Node Depths
 * The distance between a node in a Binary Tree
 * and the tree's root is called the node's depth.
 * Write a function that takes in a Binary Tree and
 * returns the sum of its nodes' depths.
 * Each BinaryTree node has an integer
 * value , a left child node, and a right
 * child node. Children nodes can either be
 * BinaryTree nodes themselves or None /
 * null .
 * Sample Input
 * tree = 1
 * / \
 * 2 3
 * / \ / \
 * 4 5 6 7
 * / \
 * 8 9
 * Sample Output
 * Hints
 * 16
 * The depth of the node with valu
 * The depth of the node with valu
 * The depth of the node with valu
 * The depth of the node with valu
 * Etc
 * Summing all of these depths yie
 * <p>
 * Hints
 * Hint 1
 * As obvious as it may seem, to solve this
 * question, you'll have to gure out how to
 * compute the depth of any given node;
 * once you know how to do that, you can
 * compute all of the depths and add them
 * up to obtain the desired output.
 * Hint 2
 * To compute the depth of a given node,
 * you need information about its position
 * in the tree. Can you pass this
 * information down from the node's
 * parent?
 * Hint 3
 * The depth of any node in the tree is
 * equal to the depth of its parent node
 * plus 1. By starting at the root node
 * whose depth is 0, you can pass down to
 * every node in the tree its respective
 * depth, and you can implement the
 * algorithm that does this and that sums
 * up all of the depths e
 * <p>
 * Optimal Space & Time
 * Complexity
 * Average case: when the tree is balanced
 * O(n) time | O(h) space - where n is the
 * number of nodes in the Binary Tree and
 * h is the height of the Binary Tree
 */
class Program {


    private static int finalSum = 0;

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        // because the same instance of Program class is used for all tests
        // this ensures finalSum is reset to 0 before each new test
        finalSum = 0;
        int runningSum = 0;
        depthHelper(root.left, runningSum);
        depthHelper(root.right, runningSum);
        return finalSum;
    }

    private static void depthHelper(BinaryTree node, int runningSum) {
        if (node == null) return;
        runningSum++;
        finalSum += runningSum;
        depthHelper(node.left, runningSum);
        depthHelper(node.right, runningSum);
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
