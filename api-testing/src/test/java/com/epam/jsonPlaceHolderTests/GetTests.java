package com.epam.jsonPlaceHolderTests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTests {


    @Test
    public void getUsersTest(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
        RequestSpecification requestSpecification= given();
        Response response=requestSpecification.get("users/1");
        response.getBody().prettyPrint();
//        JsonPath jsonPath=response.jsonPath();
//        String name=jsonPath.get("name");
//        System.out.println(name);
    }
    @Test
    public void getUsersAnotherTest(){
        given().when().get("https://jsonplaceholder.typicode.com/users/1")
                .then().statusCode(200);
    }
}
