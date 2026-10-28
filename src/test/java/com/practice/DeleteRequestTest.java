package com.practice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequestTest {

    @Test
    public void deletePost() {

        given()

        .when()
            .delete("https://jsonplaceholder.typicode.com/posts/1")

        .then()
            .statusCode(200);
    }
}