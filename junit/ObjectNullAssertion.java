package examples;

import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ObjectNullAssertion {
    @Test
    void personHasFirstName() {
        Person person = new Person("John","Doe");

        // Assertion
        assertNotNull(person.getFirstName()); //Pass
        System.out.println((person.getFirstName()));
        System.out.println((person.getLastName()));
        assertNull(person.getLastName()); //Fail

    }
}
