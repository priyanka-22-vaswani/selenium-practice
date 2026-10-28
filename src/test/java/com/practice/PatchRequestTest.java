package com.practice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PatchRequestTest {

    @Test
    void patchPost() {

        String requestBody = """
        {
            "title": "Updated using PATCH"
        }
        """;

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .patch("https://jsonplaceholder.typicode.com/posts/1")
        .then()
            .statusCode(200)
            .body("title", equalTo("Updated using PATCH"));
    }
}