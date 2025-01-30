package org.example.jacoco.strings.turkish;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TurkishStringServiceTest {

    private final TurkishStringService turkishStringService = new TurkishStringService();

    @Test
    void testToUpperCaseTurkish() {
        assertEquals("İSTANBUL", turkishStringService.toUpperCaseTurkish("istanbul"));
        assertEquals("IĞDIR", turkishStringService.toUpperCaseTurkish("ığdır"));
        assertNull(turkishStringService.toUpperCaseTurkish(null));
    }

    @Test
    void testToLowerCaseTurkish() {
        assertEquals("istanbul", turkishStringService.toLowerCaseTurkish("İSTANBUL"));
        assertEquals("ığdır", turkishStringService.toLowerCaseTurkish("IĞDIR"));
        assertNull(turkishStringService.toLowerCaseTurkish(null));
    }

    @Test
    void testRemoveAccents() {
        assertEquals("gorusuruz", turkishStringService.removeAccents("görüşürüz"));
        assertEquals("cocuk", turkishStringService.removeAccents("çocuk"));
        assertNull(turkishStringService.removeAccents(null));
    }

}