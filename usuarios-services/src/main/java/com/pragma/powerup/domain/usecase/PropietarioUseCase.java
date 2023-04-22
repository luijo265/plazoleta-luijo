package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPropietarioPort;
import com.pragma.powerup.domain.model.PropietarioModel;
import com.pragma.powerup.domain.spi.IPropietarioPersistencePort;

public class PropietarioUseCase implements IPropietarioPort {

    private final IPropietarioPersistencePort propietarioRepository;

    public PropietarioUseCase(){
        this.propietarioRepository = null;
    }

    @Override
    public void crearPropietario(PropietarioModel propietario) {
//        propietarioRepository.guardarPropietario(propietario);
        System.out.println("Creado el propietario");
    }

    @Override
    public void crearPropietario() {
        System.out.println("Creado el propietario");
    }
    


}
