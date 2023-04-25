package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPropietarioPort;
import com.pragma.powerup.domain.model.PropietarioModel;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;

public class PropietarioUseCase implements IPropietarioPort {

    private final IUsuarioPersistencePort propietarioRepository;

    public PropietarioUseCase(IUsuarioPersistencePort propietarioRepository){
        this.propietarioRepository = propietarioRepository;
    }

    @Override
    public void crearPropietario(PropietarioModel propietario) {
        propietario.setRol(PropietarioModel.ROL_TAG);
        propietarioRepository.guardarPropietario(propietario);
        System.out.println("Creado el propietario");
    }

    @Override
    public void crearPropietario() {
        System.out.println("Creado el propietario");
    }
    


}
