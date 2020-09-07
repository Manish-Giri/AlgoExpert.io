package net.manishgiri.easy.bubblesort.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void testBubbleSort() {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        int[] result = Program.bubbleSort(arr);
        assertArrayEquals(result, new int[]{2, 3, 5, 5, 6, 8, 9});
    }
}