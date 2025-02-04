package org.example.jacoco.numbers.fraction;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class FractionService {

    public class AdditionHandler {
        private int precision;

        public AdditionHandler() {
            this(2);
        }

        public AdditionHandler(int precision) {
            this.precision = precision;
        }

        public double add(double a, double b) {
            return round(a + b, precision);
        }

        private double round(double value, int places) {
            BigDecimal bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }
    }

    private class SubtractionHandler {
        private String handlerName;

        public SubtractionHandler() {
            this("DefaultSubtractor");
        }

        public SubtractionHandler(String name) {
            this.handlerName = name;
        }

        public double subtract(double a, double b) {
            System.out.println("Operation handled by: " + handlerName);
            return a - b;
        }
    }

    public double multiply(double a, double b) {
        MathOperation operation = new MathOperation() {
            @Override
            public double execute(double x, double y) {
                return x * y;
            }
        };
        return operation.execute(a, b);
    }

    public double divide(double a, double b) {
        MathOperation division = new MathOperation() {
            @Override
            public double execute(double x, double y) {
                if (y == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return x / y;
            }
        };
        return division.execute(a, b);
    }

    private interface MathOperation {
        double execute(double a, double b);
    }

    public SubtractionHandler createSubtractor(String name) {
        return new SubtractionHandler(name);
    }
}