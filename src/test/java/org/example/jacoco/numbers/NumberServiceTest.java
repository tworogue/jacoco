package org.example.jacoco.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberServiceTest {

    private final NumberService numberService = new NumberService();

    @Test
    void testAdd() {
        assertEquals(5, numberService.add(2, 3));
        assertEquals(-1, numberService.add(2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, numberService.subtract(3, 2));
        assertEquals(5, numberService.subtract(2, -3));
    }

    @Test
    void testMultiply_broken() {
        assertEquals(11, numberService.multiply(2, 6));
    }


    @Test
    void testDivide() {
        assertEquals(2.0, numberService.divide(4, 2));
        assertEquals(0.5, numberService.divide(1, 2));

        Exception exception = assertThrows(ArithmeticException.class, () -> numberService.divide(1, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testIsEven() {
        assertTrue(numberService.isEven(4));
        assertFalse(numberService.isEven(3));
    }
}

