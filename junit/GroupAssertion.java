package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAssertion {
    @Test
    void firstAndLastNameMatches() {

        Person person = new Person("John", "Doe");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        // Grouped Assertion
        assertAll("person",
                // Assertion for first name
                  ()->assertEquals("John", person.getFirstName()),
                // Assertion for last name
                   ()->assertEquals("Doe", person.getLastName())
                  );

    }
}
