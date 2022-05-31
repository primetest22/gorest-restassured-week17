package in.co.gorest.verifydatafromresponse;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class VerifyData {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "https://gorest.co.in/";
        RestAssured.basePath = "public/v2";
        response = given()
                .when()
                .get("/users")
                .then().statusCode(200);

    }

    //Verify total records
    @Test
    public void test001() {
        ArrayList<Integer> record = response.extract().path("length");
        System.out.println("Verify total record : " + record.size());
    }

    //Verify id 3852 has name ganesh joshi
    @Test
    public void test002() {
        String name = response.extract().path("[2].name");
        System.out.println("Verify id 3853 has name  : " + name);
    }

    //Verify id 3850 has email nambeesan_ramaa@wisoky-cummerata.org
    @Test
    public void test003() {
        String email = response.extract().path("[3].email");
        System.out.println("Verify id 3850 has email : " + email);
    }



}




