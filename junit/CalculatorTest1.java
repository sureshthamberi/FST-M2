package examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// The Test class should start or end with "Test"
public class CalculatorTest1 {

        private Calculator calculator;

        @BeforeEach
        public void setUp() throws Exception {
            calculator = new Calculator();
        }

        @Test
        @DisplayName("Simple multiplication should work")
        public void testMultiply() {
            assertEquals(20, calculator.multiply(4, 5));
        }
    }

