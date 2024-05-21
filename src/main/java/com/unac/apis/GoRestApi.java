package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "e871d08829b6c03f39b4eea4d1e51522ab2cf5b59685c8d082f196db681b6254";
    private static String pathName = "status";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String requestBody) {
        RestInteractions.executionPutToken(endPoint,idUser,TOKEN, requestBody);
    }

    public static void validateResponse(Integer statusCode, String status) {
        RestInteractions.validatecode(statusCode);
        RestInteractions.validateDataResponse(status,pathName);
    }
}
