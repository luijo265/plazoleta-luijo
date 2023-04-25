package com.pragma.powerup.domain.exception;

public class ValidacionAtributoException extends RuntimeException {

    private final String nombreAtributo;
    private final String mensajeValidacion;

    public ValidacionAtributoException(String message, String nombreAtributo, String mensajeValidacion){
        super(message);
        this.mensajeValidacion = mensajeValidacion;
        this.nombreAtributo = nombreAtributo;
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public String getMensajeValidacion() {
        return mensajeValidacion;
    }

}
