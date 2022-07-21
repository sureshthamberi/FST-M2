package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterNullEmptyBlanck {

    @ParameterizedTest
    //@NullSource
    //@EmptySource
      @NullAndEmptySource
    //@ValueSource(strings = { " ", "   ", "\t", "\n","suresh" })
    void nullEmptyAndBlankStrings(String text) {
        System.out.println(text);
        assertTrue(text == null || text.trim().isEmpty());
    }
}
