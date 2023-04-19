package com.pragma.powerup.domain.model;

public class PropietarioModel extends UsuarioModel {

    public static final String ROL_TAG = "propietario";

    @Override
    protected boolean isSuRolTag(String rol) {
        return rol.equals(ROL_TAG);
    }
}
