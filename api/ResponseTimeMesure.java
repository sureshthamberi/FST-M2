package examples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class ResponseTimeMesure {
    final static String ROOT_URI = "http://ip-api.com/json";
    @Test
    public void whenMeasureResponseTime_thenOK() {
        // Get response
        Response response = RestAssured.get(ROOT_URI + "/125.219.5.94");
        // Get response time in milliseconds
        long timeInMilliSeconds = response.time();
        // Get time in specified time unit
        long timeInSeconds = response.timeIn(TimeUnit.SECONDS);

        assertEquals(timeInSeconds, timeInMilliSeconds/1000);

    }
}
