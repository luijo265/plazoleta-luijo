package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.mapper.IPropietarioRequestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.pragma.powerup.application.dto.request.CrearPropietarioDto;
import com.pragma.powerup.application.dto.response.PropietarioCreadoDto;
import com.pragma.powerup.application.handler.IPropietarioHandler;
import com.pragma.powerup.domain.api.IPropietarioPort;

import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PropietarioHandlerImpl implements IPropietarioHandler {

    Logger logger = LoggerFactory.getLogger(PropietarioHandlerImpl.class);
    private final IPropietarioPort propietarioUseCase;

    private final IPropietarioRequestMapper propietarioRequestMapper;

    @Override
    public PropietarioCreadoDto crearPropietario(CrearPropietarioDto propietario)
    {
        try {
            propietarioUseCase.crearPropietario(
                    propietarioRequestMapper.toPropietarioModel(propietario)
            );
            return new PropietarioCreadoDto("Propietario creado");
        } catch (Exception e) {
            logger.error("Fallo",e);
            throw e;
        }
    }
    
}
