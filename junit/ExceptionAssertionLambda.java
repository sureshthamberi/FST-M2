package examples;


import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
//import programs.User;
import examples.User;
public class ExceptionAssertionLambda {


        @Test
        public void testUsernameIsNullLambda() {
            assertThrows(IllegalArgumentException.class, () -> {
                User user = new User();
                user.setName(null);
            });
        }
    }

