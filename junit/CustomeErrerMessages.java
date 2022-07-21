package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomeErrerMessages {
    @Test
    void addNumbers() {
        Calculator calculator = new Calculator();

        // Assertion with a custom message
        // that will be displayed if the test fails
        assertEquals(4, calculator.add(1, 2), "1 + 2 should equal 3");
        //assertEquals(4, calculator.add(1, 2));
    }
}
