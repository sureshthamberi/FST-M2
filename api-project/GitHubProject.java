package liveProject;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GitHubProject {
    //Declaring Request Specification
    RequestSpecification reqSpecific;
    String sshKey;

    int Id;
    @BeforeClass
    public void setUp(){
        reqSpecific = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization","token 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")
                .setBaseUri("https://api.github.com")
                .build();

    }
    @Test(priority = 1)
    public void postRequest(){
        //sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCZgDHZxBX0bwtJQcJzcqCtVAbgY0qoauWNCbHcLL30SN0AZWztqhO4fEpp2cxUhnvSxm1k/2jHECDKN6OMZg7jylkmjQC3o4MfDXdPhDFFXCiFkgbsdzFf7rJAiGxxTrW9/q64C5XKVVXOb8PzB2BIsYK/ibQm5q4LU7kHF28geXciQxBqLC+nv2ILeSteF/IHlKs59xiT4JReaYKCzJUqYan48QUZ1lWgzh5BxZtrStdOpeHLMVYtXTL87u9N8WAuczDgT0f+kGsGoSE2sOi/PgL3oKFq7xBGN6tlcPsAnnAozU11+e01DbBJXB1lTUQZp/eb92cSns+ILpvMBRDb";
        String reqBody= "{\"title\":\"TestAPIKey\",\"key\":\"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCZgDHZxBX0bwtJQcJzcqCtVAbgY0qoauWNCbHcLL30SN0AZWztqhO4fEpp2cxUhnvSxm1k/2jHECDKN6OMZg7jylkmjQC3o4MfDXdPhDFFXCiFkgbsdzFf7rJAiGxxTrW9/q64C5XKVVXOb8PzB2BIsYK/ibQm5q4LU7kHF28geXciQxBqLC+nv2ILeSteF/IHlKs59xiT4JReaYKCzJUqYan48QUZ1lWgzh5BxZtrStdOpeHLMVYtXTL87u9N8WAuczDgT0f+kGsGoSE2sOi/PgL3oKFq7xBGN6tlcPsAnnAozU11+e01DbBJXB1lTUQZp/eb92cSns+ILpvMBRDb\"}";


            Response response = given().spec(reqSpecific)
                    .body(reqBody)
                    .when().post("/user/keys");

            Id=response.then().extract().body().path("id");
            response.then().statusCode(201);
    }

    @Test(priority = 2)
     public void getRequest(){
        Response response = given().spec(reqSpecific)
                            .when().get("/user/keys/"+Id);
        System.out.println(response.getBody().asPrettyString());
        response.then().statusCode(200);

    }
    @Test(priority = 3)
    public void deleteTest(){
        Response response =  given().spec(reqSpecific)
                .when().delete("/user/keys/"+Id);
        System.out.println(response.getBody().asPrettyString());
        response.then().statusCode(204);
    }
}
