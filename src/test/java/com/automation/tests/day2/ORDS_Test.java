package com.automation.tests.day2;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class ORDS_Test {

    String Base_URL ="http://3.82.165.163:1000/ords/hr";


    @Test
    @DisplayName("Get list of all employees")

    public void getAllEmployees(){

        Response resppnse = given().
                             baseUri(Base_URL).
                             when().
                             get("/employees").prettyPeek();


    }

}
