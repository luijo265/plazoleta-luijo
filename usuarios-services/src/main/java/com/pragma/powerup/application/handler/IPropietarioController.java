package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.CrearPropietarioDto;
import com.pragma.powerup.application.dto.response.PropietarioCreadoDto;

public interface IPropietarioController {
    
    public PropietarioCreadoDto crearPropietario(CrearPropietarioDto propietario) throws Exception;

}
