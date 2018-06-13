package br.com.usuarios.funcional.api.common.exception;

import br.com.dimed.arch.jersey.exceptions.ApiException;

import javax.ws.rs.core.Response;

public class RestServiceIndisponivelException extends ApiException {

    public RestServiceIndisponivelException(String message) {
        super(message);
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getField() {
        return null;
    }

    @Override
    public String getDeveloperMessage() {
        return null;
    }

    @Override
    public Response.Status getHttpStatus() {
        return Response.Status.SERVICE_UNAVAILABLE;
    }

}
