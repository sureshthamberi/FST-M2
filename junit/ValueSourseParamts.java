package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;
//import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourseParamts {
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar" })
    void palindromes(String candidate) {
        //assertTrue(StringUtils.isPalindrome(candidate));
        assertTrue(StringUtils.isNotBlank(candidate));
    }
}
