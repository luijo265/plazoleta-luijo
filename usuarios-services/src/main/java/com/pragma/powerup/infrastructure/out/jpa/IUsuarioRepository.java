package com.pragma.powerup.infrastructure.out.jpa;

import com.pragma.powerup.infrastructure.out.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, BigInteger> {
}
