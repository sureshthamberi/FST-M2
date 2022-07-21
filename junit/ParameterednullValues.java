package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterednullValues {
 @ParameterizedTest
 @CsvSource(
            value = {"apple, banana, NIL,'',"},
            nullValues = "NIL"
    )
    void testWithCsvSourceNull(String value1, String value2,String value3, String value4) {
     //void testWithCsvSourceNull(String value1) {
     //assertNotNull(value);
     //assertNotEquals(0, nullValues);

      }
// Output: "apple", "banana", null
}
