package net.manishgiri.easy.nodedepths.solution3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void nodeDepths() {
        Program.BinaryTree root = new Program.BinaryTree(1);
        root.left = new Program.BinaryTree(2);
        root.left.left = new Program.BinaryTree(4);
        root.left.left.left = new Program.BinaryTree(8);
        root.left.left.right = new Program.BinaryTree(9);
        root.left.right = new Program.BinaryTree(5);
        root.right = new Program.BinaryTree(3);
        root.right.left = new Program.BinaryTree(6);
        root.right.right = new Program.BinaryTree(7);
        int actual = Program.nodeDepths(root);
        assertEquals(16, actual);
    }
}