package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CSVsource1 {
    @ParameterizedTest
    @CsvSource({
            "apple,         1",
            "banana,        2",
            "'lemon, lime,suresh,mahesh', 0xF1"
    })
    void testWithCsvSource(String fruit, int rank) {
        System.out.println("Iteration"+rank);
        assertNotNull(fruit);
        assertNotEquals(0, rank);
       // assertEquals(1,rank);
    }
}
