package net.manishgiri.easy.findclosestvalueinBST.solution1;

/**
 *
 * Write a function that takes in a Binary Search Tree (BST) and a target integer
 * value and returns the closest value to that target value contained in the BST.
 * You can assume that there will only be one closest value.
 *
 *   Each <span>BST</span> node has an integer <span>value</span>, a
 *   <span>left</span> child node, and a <span>right</span> child node. A node is
 *   said to be a valid <span>BST</span> node if and only if it satisfies the BST
 *   property: its <span>value</span> is strictly greater than the values of every
 *   node to its left; its <span>value</span> is less than or equal to the values
 *   of every node to its right; and its children nodes are either valid
 *   <span>BST</span> nodes themselves or <span>None</span> / <span>null</span>.
 */
class Program {
    static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int diff = -1, closest = Integer.MAX_VALUE, nodeVal = -1;
        BST parent = null, current = tree;

        while(current != null) {
            //System.out.println("Current node: " + current.value);
            diff = Math.abs(current.value-target);

            if(diff == 0)
                return current.value;

            if(diff < closest) {
                closest = diff;
                nodeVal = current.value;
            }

            if(target < current.value)
                current = current.left;
            else
                current = current.right;
        }

        return nodeVal;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
