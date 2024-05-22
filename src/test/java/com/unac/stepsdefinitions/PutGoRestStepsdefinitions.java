package com.unac.stepsdefinitions;

import com.unac.apis.GoRestApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutGoRestStepsdefinitions {
    @Given("se establece la base url {string}")
    public void seEstableceLaBaseUrl(String baseUrl) {
        GoRestApi.setBaseUrl(baseUrl);
    }

    @When("se actualiza el estado en el endpoint {string} por id {string} con el estado {string}")
    public void seActualizaElEstadoEnElEndpointPorIdConElEstado(String endPoint, String idUser, String status) {
        GoRestApi.executionPutToken(endPoint, idUser, status);
    }

    @Then("se valida que el status code {int} y que el estado sea {string}")
    public void seValidaQueElStatusCodeYQueElEstadoSea(Integer statusCode, String status) {
        GoRestApi.validatePutResponse(statusCode, status);
    }
}
