package examples;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class AssertArrays {
    @Test
    void arraysEqual() {
        final int[] array = { 3, 2, 1 };
        final int[] expected = { 1, 2, 3 };

        // Sorting an Array
        Arrays.sort(array);

        // Assertion
        assertArrayEquals(expected, array); //Pass
    }
}
