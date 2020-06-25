package net.manishgiri.easy.validatesubsequence.solution1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    void TestCase1() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        assertTrue(Program.isValidSubsequence(array, sequence));
    }

    @Test
    void TestCase2() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 2);
        assertFalse(Program.isValidSubsequence(array, sequence));
    }
}