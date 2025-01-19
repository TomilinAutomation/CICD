package api;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ReqresTest {

    @Test
    public void getUserInfoCurrent(){
    given()
            .filter(new AllureRestAssured())
            .baseUri("https://reqres.in")
            .basePath("/api/users?page=2")

            .contentType(ContentType.JSON)
            .when().get()
            .then().statusCode(200);

}
}
