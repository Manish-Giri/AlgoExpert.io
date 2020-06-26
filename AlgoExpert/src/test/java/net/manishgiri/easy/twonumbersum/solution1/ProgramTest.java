package net.manishgiri.easy.twonumbersum.solution1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void twoNumberSum() {
        int[] output = Program.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    private boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }

}