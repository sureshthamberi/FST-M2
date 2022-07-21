package examples;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// @Disable on a class with a message
@Disabled("Disabled until bug #2020 has been fixed!")
public class DisabledAnnotationOverClass {

        // All test methods are ignored
        @Test
        void test1Plus1() {
            assertEquals(2, 1 + 1);
        }

        @Test
        void test2Plus2() {
            assertEquals(4, 2 + 2);
        }
}

