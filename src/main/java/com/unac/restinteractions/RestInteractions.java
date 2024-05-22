package com.unac.restinteractions;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class RestInteractions {

    private static String baseUrl;

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.baseUrl = baseUrl;
    }

    public static void executionPutToken(String endPoint, String idUser, String token, String status) {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("status", status);

        SerenityRest.given().auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put(baseUrl.concat(endPoint).concat(idUser));

        SerenityRest.lastResponse().prettyPeek();
    }

    public static void validateCode(Integer statusCode) {
        int statusActual = SerenityRest.lastResponse().statusCode();
        assertEquals(statusActual, statusCode.intValue());
    }

    public static void validateStatusResponse(String status, String pathStatus) {
        String statusActual = SerenityRest.lastResponse()
                .jsonPath().getString(pathStatus);
        assertEquals(statusActual, status);
    }
}
