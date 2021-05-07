package net.manishgiri.categories.strings.ceasarcipherencryptor.solution1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramTest {

    @Test
    public void TestCase1() {
        assertEquals("zab", Program.caesarCypherEncryptor("xyz", 2));
    }
}
