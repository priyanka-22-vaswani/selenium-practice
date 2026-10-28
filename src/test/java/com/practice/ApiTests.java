package com.practice;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;



public class ApiTests {
    
    @Test
    void getUserInfo()
    {
//        given().
//when().
//    get("https://reqres.in/api/users/2").
//then().
//    statusCode(401);

given().
when().
    get("https://jsonplaceholder.typicode.com/users/1").
then().
    statusCode(200).
    body("name", equalTo("Leanne Graham"));

    }

    @Test
    void createPostTest()
    {
    given().
        contentType("application/json").
        body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }").
    when().
        post("https://jsonplaceholder.typicode.com/posts").
    then().
        statusCode(201).
        body("title", equalTo("foo"));
    }

    @Test
    void getCommentTest()
    {
        given().
        when().
            get("https://jsonplaceholder.typicode.com/comments/1").
        then().
            statusCode(200).
            body("email", equalTo("Eliseo@gardner.biz"));
            

    }
}
