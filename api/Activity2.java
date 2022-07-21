package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity2 {

        //define global variable
        final static String ROOT_URI = "https://petstore.swagger.io/v2/user";

      @Test(priority = 0)
          public void addNewUserFromFile() throws IOException {
          // Import JSON file
          FileInputStream inputJSON = new FileInputStream("src/test/java/activities/userinfo.json");
          // Read JSON file as String
          String reqBody = new String(inputJSON.readAllBytes());

          Response response = given().contentType(ContentType.JSON)
                  .body(reqBody)
                  .when().post(ROOT_URI);

          response.then().statusCode(200);
          response.then().body("message", equalTo("9000"));

//          String userName= response.then().extract().body().path("username");
          //Assertions.assertEquals("Suresh",userName);
          response.getBody().asPrettyString();
      }

      @Test(priority = 1)
      public void getMethod(){

          Response response = given().contentType(ContentType.JSON)
                  .when().pathParam("username","Suresh")
                  .get(ROOT_URI+"/{username}");
          response.then().statusCode(200);
      }
      @Test(priority = 2)
      public void deleteMethod(){
          Response response = given().contentType(ContentType.JSON)
                  .when().pathParam("username","Suresh")
                  .delete(ROOT_URI+"/{username}");
          response.then().statusCode(200);

      }
}
