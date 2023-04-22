package com.pragma.powerup.infrastructure.out.mapper;

import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.infrastructure.out.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IUsuarioEntityMapper {

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellido", target = "apellido")
    @Mapping(source = "identificacion", target = "identificacion")
    @Mapping(source = "celular", target = "celular")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "clave", target = "clave")
    @Mapping(source = "fechaNacimiento", target = "fechaNacimiento")
    @Mapping(source = "rol", target = "rol")
    UsuarioEntity toUsuarioEntity(UsuarioModel usuarioModel);

}
