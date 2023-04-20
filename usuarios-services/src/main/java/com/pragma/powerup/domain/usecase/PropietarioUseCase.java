package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPropietarioUseCase;
import com.pragma.powerup.domain.model.PropietarioModel;
import com.pragma.powerup.domain.spi.IPropietarioRepository;

public class PropietarioUseCase implements IPropietarioUseCase{

    private final IPropietarioRepository propietarioRepository;

    public PropietarioUseCase(IPropietarioRepository propietarioRepository){
        this.propietarioRepository = propietarioRepository;
    }

    @Override
    public void crearPropietario(PropietarioModel propietario) {
        propietarioRepository.guardarPropietario(propietario);
        System.out.println("Creado el propietario");
    }
    


}
