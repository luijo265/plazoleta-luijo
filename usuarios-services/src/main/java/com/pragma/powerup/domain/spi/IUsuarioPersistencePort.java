package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.PropietarioModel;

public interface IUsuarioPersistencePort {
    
    public void guardarPropietario(PropietarioModel propietario);

}
