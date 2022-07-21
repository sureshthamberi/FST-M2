package examples;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class AssertAll {
    @Test
    void firstAndLastNameMatches() {
        Person person = new Person("John", "Doe");

        // Grouped Assertion
        assertAll("person",                                      // with optional title message
        //assertAll(                                             // without optional title message
                // Assertion for first name
                   ()->assertEquals("John", person.getFirstName()),
                // Assertion for last name
                    ()->assertEquals("Deo", person.getLastName())
                  );
    }
}
