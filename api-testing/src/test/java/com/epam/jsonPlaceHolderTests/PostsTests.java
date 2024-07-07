package com.epam.jsonPlaceHolderTests;

import com.epam.pojo.Users;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostsTests {
    @Test
    public void postUsersTest(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
        RequestSpecification requestSpecification= given().contentType("application/json");
        Response response=requestSpecification.body(Users.getUser()).post("users");
        response.getBody().prettyPrint();
    }
}
