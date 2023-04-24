package com.pragma.powerup.infrastructure.out.adapter;

import com.pragma.powerup.domain.model.PropietarioModel;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;
import com.pragma.powerup.infrastructure.out.entity.UsuarioEntity;
import com.pragma.powerup.infrastructure.out.jpa.IUsuarioRepository;
import com.pragma.powerup.infrastructure.out.mapper.IUsuarioEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements IUsuarioPersistencePort {

    private final IUsuarioRepository repository;

    private final IUsuarioEntityMapper mapper;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void guardarPropietario(PropietarioModel propietario) {
        UsuarioEntity usuario = mapper.toUsuarioEntity(propietario);
        usuario.setClave(passwordEncoder.encode(usuario.getClave()));
        repository.save(usuario);
    }
}
