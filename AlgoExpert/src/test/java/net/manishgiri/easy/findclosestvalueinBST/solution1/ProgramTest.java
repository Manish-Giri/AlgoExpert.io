package net.manishgiri.easy.findclosestvalueinBST.solution1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void findClosestValueInBst() {
        Program.BST root = new Program.BST(10);
        root.left = new Program.BST(5);
        root.left.left = new Program.BST(2);
        root.left.left.left = new Program.BST(1);
        root.left.right = new Program.BST(5);
        root.right = new Program.BST(15);
        root.right.left = new Program.BST(13);
        root.right.left.right = new Program.BST(14);
        root.right.right = new Program.BST(22);

        int expected = 13;
        int actual = Program.findClosestValueInBst(root, 12);
        assertEquals(expected, actual);
    }
}