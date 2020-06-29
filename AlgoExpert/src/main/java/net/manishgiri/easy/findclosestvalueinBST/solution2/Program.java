package net.manishgiri.easy.findclosestvalueinBST.solution2;

class Program {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }


    private static int closestNode = -1;

    static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int closest = Integer.MAX_VALUE;
        findValueRec(tree, target, closest);
        return closestNode;
    }

    // This is still O(n) time, not O(log n) because all  nodes are checked
    private static void findValueRec(BST root, int target, int closest) {
        if(root == null) return;
        int diff = Math.abs(target - root.value);
        if(diff < closest) {
            closest = diff;
            closestNode = root.value;
        }
        findValueRec(root.left, target, closest);
        findValueRec(root.right, target, closest);
    }
}
