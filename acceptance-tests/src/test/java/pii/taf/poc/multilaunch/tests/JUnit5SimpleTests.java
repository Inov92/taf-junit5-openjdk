package pii.taf.poc.multilaunch.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5SimpleTests {

    @Test
    void simpleTest() {
        assertEquals("Check JUnit5", "Check JUnit5", "JUnit5 is not working");
    }
}
