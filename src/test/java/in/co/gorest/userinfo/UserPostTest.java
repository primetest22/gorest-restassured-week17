package in.co.gorest.userinfo;

import in.co.gorest.model.UserPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserPostTest extends TestBase {

    @Test
    public void createUser() {

        UserPojo userPojo = new UserPojo();
        userPojo.setName("Tenali Ramakrishna");
        userPojo.setEmail("tenali.ramakrishna@156755ce.com");
        userPojo.setGender("male");
        userPojo.setStatus("active");

        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 65babb7d183fd43b387f46bfd04954108a5d0560e33e264be4dbfc9f46d826e1" )
                .body(userPojo)
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();


    }

}
