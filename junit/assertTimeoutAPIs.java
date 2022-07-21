package examples;


import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMinutes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class assertTimeoutAPIs {
    @Test
    void timeoutNotExceeded() {
        // error here -> assertTimeout(ofMinutes(1), () -> service.doBackup());
    }

    // if you have to check a return value
    @Test
    void timeoutNotExceededWithResult() {
        //-- error here -> String actualResult = assertTimeout(ofSeconds(1), () -> {
            // error here -> return restService.request(request);
        //});
        //-- erreor here ->assertEquals(200, request.getStatus());
    }
}
