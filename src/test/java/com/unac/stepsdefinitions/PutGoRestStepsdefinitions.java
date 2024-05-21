package com.unac.stepsdefinitions;

import com.unac.apis.GoRestApi;
import io.cucumber.java.en.*;

public class PutGoRestStepsdefinitions {

    @Given("se establece la base URL {string}")
    public void seEstableceLaBaseUrl(String baseUrl) {
        GoRestApi.setBaseUrl(baseUrl);
    }

    @When("se usa el endpoint {string} se actualiza el usuario con el ID {string} donde se cambiará su status a {string}")
    public void seUsaElEndpointSeActualizaElUsuarioConElIDDondeSeCambiaraSuStatusA(String endPoint, String idUser, String status) {
        String requestBody = "{\n" +
                "    \"status\": \"" + status + "\"\n" +
                "}";
        GoRestApi.executionPutToken(endPoint, idUser, requestBody);
    }

    @Then("se valida que el status code {int} y que contenga el status {string}")
    public void seValidaQueElStatusCodeYQueContengaElStatus(Integer statusCode, String status) {
        GoRestApi.validateResponse(statusCode, status);
    }
}
