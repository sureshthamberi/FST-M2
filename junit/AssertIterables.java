package examples;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AssertIterables {

    @Test
    void iterablesEqual() {
        final List<String> list = Arrays.asList("orange", "mango", "banana");
        final List<String> expected = Arrays.asList("banana", "mango", "orange");

        // Add a new value
        list.add("apple");

        // Sort array
        Collections.sort(list);

        // Assertion
        assertIterableEquals(expected, list); //Fail
    }
    }

