package pii.taf.poc.multilaunch.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5SimpleTests {

    @Test
    void simpleTest() {
        assertEquals("Message", "Message", "JUnit5 not working");
    }
}
