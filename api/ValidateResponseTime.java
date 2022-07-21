package examples;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static io.restassured.RestAssured.when;
//import static org.hamcrest.number.OrderingComparison.lessThan;
//import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.hamcrest.Matchers.lessThan;

public class ValidateResponseTime {
    final static String ROOT_URI = "http://ip-api.com/json";
    @Test
    public void whenValidateResponseTime_thenSuccess() {
        when().get(ROOT_URI + "/125.219.5.94")
                // Validate response time in milliseconds
                .then().time(lessThan(5L), TimeUnit.SECONDS);   // Validate response time in seconds
                //.then().time(lessThan(5000L));   // Validate response time in milliseconds
    }
}
