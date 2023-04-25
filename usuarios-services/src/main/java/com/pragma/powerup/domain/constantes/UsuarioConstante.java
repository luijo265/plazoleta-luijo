package com.pragma.powerup.domain.constantes;

public class UsuarioConstante {
    public static final int LONGITUD_NOMBRE = 100;
    public static final int LONGITUD_APELLIDO = 100;
    public static final int LONGITUD_IDENTIFICACION = 100;
    public static final int LONGITUD_CELULAR = 13;
    public static final int LONGITUD_CORREO = 100;
    public static final int LONGITUD_CLAVE = 100;
    public static final String EXPRESION_REGULAR_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    public static final String EXPRESION_REGULAR_CELULAR = "((^\\d{10}$)|(^\\+\\d{2}\\d{10}$))";
    public static final String EXPRESION_REGULAR_IDENTIFICAION = "\\d";
    public static final int MAYOR_EDAD = 18;

    public static final String MESSAGE_CAMPO_NO_VALIDO = "Campo no válido";

    private UsuarioConstante(){}
}
