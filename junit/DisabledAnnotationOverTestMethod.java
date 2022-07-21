package examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class DisabledAnnotationOverTestMethod {

        // Ignored test method
        @Disabled("Disabled until CustomerService is up!")
        @Test
        void testCustomerServiceGet() {
            assertEquals(2, 1 + 1);
        }

        // Test method that will execute
        @Test
        void test3Plus3() {
            assertEquals(6, 3 + 3);
        }
    }

