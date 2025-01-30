package org.example.jacoco.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringServiceTest {

    private final StringService stringService = new StringService();

    @Test
    void testReverseString() {
        assertEquals("olleH", stringService.reverseString("Hello"));
        assertEquals("321", stringService.reverseString("123"));
        assertEquals("", stringService.reverseString(""));
        assertNull(stringService.reverseString(null));
    }

    @Test
    void testToUpperCase() {
        assertNull(stringService.toUpperCase(null));
    }

}