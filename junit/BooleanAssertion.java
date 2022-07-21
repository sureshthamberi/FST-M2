package examples;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BooleanAssertion {
    @Test
   public void firstNameStartsWithJ() {
        Person person = new Person("John", "Doe");

        // Assertion
        //assertTrue(person.getFirstName().startsWith("J")); //Pass
        assertFalse(person.getFirstName().startsWith("D")); // Fail
    }
    }

