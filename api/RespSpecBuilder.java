package examples;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RespSpecBuilder {
    // Declare response specification
    ResponseSpecification responseSpec;
    final static String ROOT_URI ="https://petstore.swagger.io/v2/pet";
    @BeforeClass
    public void setUp() {
// Create response specification
        responseSpec = new ResponseSpecBuilder()
                // Check status code in response
                .expectStatusCode(200)
                // Check response content type
                .expectContentType("application/json")
                // Check if response contains name property
                .expectBody("status", equalTo("alive"))
                // Build response specification
                .build();
    }

    @Test
    public void testPet1() {
        Response response = given()
                .contentType(ContentType.JSON) // Set content type
                //.setBaseUri("https://petstore.swagger.io/v2/pet")
                .pathParam("petId", "77232") // Set path parameter
                .get(ROOT_URI+"/{petId}"); // Send GET request

// Print response
        String body = response.getBody().asPrettyString();
        System.out.println(body);

// Assertion with response specification
        response.then().spec(responseSpec);
    }
}
