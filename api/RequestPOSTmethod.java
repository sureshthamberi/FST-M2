package examples;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RequestPOSTmethod {

    // Set Base URL
// No need to add questions mark in the URL.
// queryParam() will automatically add it while parsing.
    final static String ROOT_URI = "http://ip-api.com/json";
    // Write the request body
    String reqBody = "{\"id\": 77232,\"name\": \"Hansel\",\"status\": \"alive\"}";

    @Test
    public void getIPInformation() {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        // Add query parameter
                        .with().body(reqBody)
                        //.when().queryParam("fields", "query,country,city,timezone")
                        //.get(ROOT_URI + "/125.219.5.94"); // Send GET request
                        .request("POST", ROOT_URI);// + "/125.219.5.94");

        // Print response
        System.out.println(response.getBody().asPrettyString());
    }
}
