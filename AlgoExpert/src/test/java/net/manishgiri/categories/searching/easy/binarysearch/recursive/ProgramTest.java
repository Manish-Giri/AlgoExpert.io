package net.manishgiri.categories.searching.easy.binarysearch.recursive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void binarySearch() {

        assertEquals(Program.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33), 3);
    }
}