package com.practice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PutRequestTest {

    @Test
    public void updatePost() {

        String requestBody = """
        {
            "id":1,
            "title":"Updated Title",
            "body":"Updated Body",
            "userId":1
        }
        """;

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .put("https://jsonplaceholder.typicode.com/posts/1")

        .then()
            .statusCode(200)
            .body("title", equalTo("Updated Title"))
            .body("body", equalTo("Updated Body"))
            .body("userId", equalTo(1));
    }
}