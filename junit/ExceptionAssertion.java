package examples;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertThrows;
    class ExceptionAssertion {
        @Test
        public void testUsernameIsNull() {
            assertThrows(IllegalArgumentException.class, new Executable() {
                @Override
                public void execute() throws Throwable {
                    User user = new User();
                    user.setName(null);
                }
            });
        }
    }

