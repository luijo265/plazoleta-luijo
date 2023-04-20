package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.exception.ValidacionAtributoException;
import com.pragma.powerup.domain.model.PropietarioModel;

public interface IPropietarioUseCase {
    
    public void crearPropietario(PropietarioModel propietario) throws ValidacionAtributoException;

}
