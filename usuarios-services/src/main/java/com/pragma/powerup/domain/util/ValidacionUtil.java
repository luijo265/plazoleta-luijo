package com.pragma.powerup.domain.util;

import java.util.regex.Pattern;

public class ValidacionUtil {

    private ValidacionUtil(){}

    public static boolean isCampoInvalido(String campo, int longitudMaxima){
        return (campo == null || campo.length() == 0 || campo.length() > longitudMaxima);
    }

    public static boolean isCoincideExpresionRegular(String campo, String patron){
        return Pattern.compile(patron)
                .matcher(campo)
                .matches();
    }

}
