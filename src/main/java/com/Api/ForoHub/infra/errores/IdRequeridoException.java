package com.Api.ForoHub.infra.errores;

public class IdRequeridoException extends RuntimeException {
    public IdRequeridoException(String mensaje) {
        super(mensaje);
    }
}