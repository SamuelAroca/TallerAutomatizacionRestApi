package com.unac.restinteractions;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import static org.junit.Assert.assertEquals;

public class RestInteractions {

    private static String baseUrl;
    public static void setBaseUrl(String baseUrl) {
        RestInteractions.baseUrl = baseUrl;
    }

    public static void executionPutToken(String endPoint, String idUser, String token, String requestBody) {
        SerenityRest.given().auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put(baseUrl.concat(endPoint).concat(idUser));

        SerenityRest.lastResponse().prettyPeek();
    }

    public static void validatecode(Integer statusCode) {
        Integer statusActual = SerenityRest.lastResponse().statusCode();
        System.out.println(statusActual);
        assertEquals(statusActual,statusCode);
    }

    public static void validateDataResponse(String status, String pathName) {
        String nombreActual = SerenityRest.lastResponse()
                .jsonPath().getString(pathName);
        assertEquals(nombreActual, status);
    }
}
