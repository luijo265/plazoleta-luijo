package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.CrearPropietarioDto;
import com.pragma.powerup.domain.model.PropietarioModel;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface IPropietarioRequestMapper {


    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "lastName", target = "apellido")
    @Mapping(source = "identification", target = "identificacion")
    @Mapping(source = "cellPhone", target = "celular")
    @Mapping(source = "email", target = "correo")
    @Mapping(source = "password", target = "clave")
    @Mapping(source = "birthDate", target = "fechaNacimiento")
    @Mapping(target = "rol", ignore = true)
    PropietarioModel toPropietarioModel(CrearPropietarioDto propietarioDto);

}
