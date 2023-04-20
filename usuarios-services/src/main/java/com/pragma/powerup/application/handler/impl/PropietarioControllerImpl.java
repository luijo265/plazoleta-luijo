package com.pragma.powerup.application.handler.impl;

import org.springframework.stereotype.Service;

import com.pragma.powerup.application.dto.request.CrearPropietarioDto;
import com.pragma.powerup.application.dto.response.PropietarioCreadoDto;
import com.pragma.powerup.application.handler.IPropietarioController;
import com.pragma.powerup.domain.api.IPropietarioUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PropietarioControllerImpl implements IPropietarioController {

    private final IPropietarioUseCase propietarioUseCase;

    @Override
    public PropietarioCreadoDto crearPropietario(CrearPropietarioDto propietario) 
        throws Exception
    {
        try {
            propietarioUseCase.crearPropietario(null);
            return new PropietarioCreadoDto("Propietario creado");
        } catch (Exception e) {
            throw new Exception("Chao");
        }
    }
    
}
