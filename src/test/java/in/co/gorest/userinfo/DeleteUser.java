package in.co.gorest.userinfo;

import in.co.gorest.model.UserPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {

     @Test
     public void deleteUser(){

         Response response = given()
                 .when()
                 .header("Content-Type","application/json")
                 .header("Authorization","Bearer 65babb7d183fd43b387f46bfd04954108a5d0560e33e264be4dbfc9f46d826e1")
                 .delete("/users/16");
         response.then().statusCode(204);
         response.prettyPrint();

     }


}


