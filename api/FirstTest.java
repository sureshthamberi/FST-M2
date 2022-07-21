package examples;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest {
    // Base URI
    final String baseURI="https://petstore.swagger.io/v2/pet";


    @Test
    public void simpleTest(){
        //Get a response
        Response response= given().contentType(ContentType.JSON).
                when().get(  baseURI + "/findByStatus?status=sold");
        //System.out.println(response.getBody().asString());
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getHeaders().asList());
        String petStatus= response.then().extract().body().path("[0].status");
        String dataHeader= response.then().extract().header( "Date");
        System.out.println("Header:"+ dataHeader);

        //Assertions -
        response.then().statusCode(200);
        response.then().body("[0].status",equalTo("sold"));
        response.then().extract().body().path("[0].status");

        //TestNG assertions

        Assert.assertEquals(petStatus,"sold");
    }
}
