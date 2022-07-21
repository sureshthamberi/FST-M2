package examples;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.post;
import static org.hamcrest.Matchers.equalTo;

public class XMLresponseVerify {

    @Test
    public void givenUrl_whenXmlResponseValueTestsEqual_thenCorrect() {
        post("/employees").then().assertThat()
                .body("employees.employee.first-name", equalTo("Jane"));

    }
}
