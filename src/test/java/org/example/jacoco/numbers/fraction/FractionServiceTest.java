package org.example.jacoco.numbers.fraction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FractionServiceTest {

    @Autowired
    private FractionService fractionService;

    @Test
    void testAdditionWithDefaultPrecision() {
        FractionService.AdditionHandler adder = fractionService.new AdditionHandler();
        double result = adder.add(1.111, 2.222);
        assertEquals(3.33, result, 0.001);
    }

    @Test
    void testCustomPrecisionAddition() {
        FractionService.AdditionHandler adder = fractionService.new AdditionHandler(3);
        double result = adder.add(1.1111, 2.2222);
        assertEquals(3.333, result, 0.001);
    }

    @Test
    void testMultiplication() {
        double result = fractionService.multiply(2.5, 4.0);
        assertEquals(10.0, result, 0.001);
    }
}