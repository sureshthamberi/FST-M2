package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooleanAssertionTest {

    @Test
    void firstNameStartsWithJ() {
        Person person = new Person("John","Doe");

        // Assertion
        assertTrue(person.getFirstName().startsWith("J")); //Pass
        assertFalse(person.getFirstName().startsWith("J")); // Fail
    }
}
