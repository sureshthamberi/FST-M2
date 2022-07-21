package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CSVFileSourceNull {

    @ParameterizedTest
    @CsvFileSource(
            files = "src/test/resources/two-column.csv",numLinesToSkip = 1,
            nullValues = "2"
    )

    void testWithCsvFileSourceFromFile(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }
// Output: "Poland", null
}

