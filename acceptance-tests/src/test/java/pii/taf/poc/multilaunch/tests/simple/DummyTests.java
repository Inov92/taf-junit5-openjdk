package pii.taf.poc.multilaunch.tests.simple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyTests {

    @Test
    void test1() {
        assertTrue(true);
    }

    @Test
    void test2() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test3() {
        String str1 = "hello";
        String str2 = "HELLO";
        assertNotEquals(str1, str2, "The strings should not be equal");
    }
}
