package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "270ee8ce7b5c015304c7c9c67ad1e80e47ec7afbf6fea997ca707545d3e371eb";
    private static String pathStatus = "status";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String status){
        RestInteractions.executionPutToken(endPoint, idUser, TOKEN, status);
    }

    public static void validatePutResponse(Integer statusCode, String status) {
        RestInteractions.validatecode(statusCode);
        RestInteractions.validateStatusResponse(status, pathStatus);
    }
}
