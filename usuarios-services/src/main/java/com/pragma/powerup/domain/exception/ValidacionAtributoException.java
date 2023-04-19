package com.pragma.powerup.domain.exception;

public class ValidacionAtributoException extends RuntimeException {

    private String nombreAtributo;
    private String mensajeValidacion;

    public ValidacionAtributoException(String message, String nombreAtributo, String mensajeValidacion){
        super(message);
        this.mensajeValidacion = mensajeValidacion;
        this.nombreAtributo = nombreAtributo;
    }

}
