package net.manishgiri.easy.productsum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void productSum() {
        List<Object> test =
                new ArrayList<>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));

        assertEquals(Program.productSum(test), 12);
    }
}