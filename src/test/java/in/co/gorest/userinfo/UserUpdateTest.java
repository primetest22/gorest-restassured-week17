package in.co.gorest.userinfo;

import in.co.gorest.model.UserPojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserUpdateTest {

    //Update user
    @Test
    public void updateEmployee(){

        UserPojo userPojo = new UserPojo();
        userPojo.setName("Allasani Peddana");
        userPojo.setEmail("allasani.peddana@155ce.com");
        userPojo.setStatus("active");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer 65babb7d183fd43b387f46bfd04954108a5d0560e33e264be4dbfc9f46d826e1")
                .body(userPojo)
                .patch("/users/16");
        response.then().statusCode(200);
        response.prettyPrint();


    }

}
