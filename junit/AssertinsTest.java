package examples;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AssertinsTest {
       static Calculator calc;
       @BeforeAll
    static public void setUp(){

           calc = new Calculator();
       }

    @Test
    void addNumbers() {


        // Assertion
        assertEquals(3, calc.add(1, 2)); // Passes
        assertNotEquals(3, calc.add(1, 2)); // Fails
    }
}

