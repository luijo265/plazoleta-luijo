package com.pragma.powerup.domain.model;

import com.pragma.powerup.domain.exception.ValidacionAtributoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class PropietarioModelTest {

    private PropietarioModel propietarioModel;

    @BeforeEach
    void setUp(){
        propietarioModel = new PropietarioModel();
    }

    @Test
    void tieneRolPropietario(){
        propietarioModel.setRol("propietario");
        assertEquals(PropietarioModel.ROL_TAG, propietarioModel.getRol());
    }

    @Test
    void noTieneRolPropietario(){
        assertThrows(ValidacionAtributoException.class, () -> propietarioModel.setRol("admin"));
    }

    @Test
    void guardandoNombre(){
        propietarioModel.setNombre("Luis");
        assertNotNull(propietarioModel.getNombre());
    }

    @Test
    void errorGuardandoNombre(){
        assertThrows(ValidacionAtributoException.class, () ->  propietarioModel.setNombre(null));
    }

    @Test
    void guardandoCelularSinPrefijo(){
        propietarioModel.setCelular("3054469926");
        assertNotNull(propietarioModel.getCelular());
    }

    @Test
    void guardandoCelularConPrefijo(){
        propietarioModel.setCelular("+573054469926");
        assertNotNull(propietarioModel.getCelular());
    }

    @Test
    void errorGuardandoCelularVacio(){
        assertThrows(ValidacionAtributoException.class, () -> propietarioModel.setCelular(""));
    }

    @Test
    void errorGuardandoCelularNoValido(){
        assertThrows(ValidacionAtributoException.class, () -> propietarioModel.setCelular("30544699269"));
    }

    @Test
    void guardandoFechaNacimiento(){
        // Arrange
        LocalDate fechaNacimiento = LocalDate.of(1991, 6, 4);

        // Act
        propietarioModel.setFechaNacimiento(fechaNacimiento);

        // Assets
        assertNotNull(propietarioModel.getFechaNacimiento());
    }

    @Test
    void errorGuardandoFechaNacimiento(){
        // Arrange
        LocalDate fechaNacimiento = LocalDate.of(2020, 6, 4);

        // Asserts
        assertThrows(
            ValidacionAtributoException.class, 
            () -> propietarioModel.setFechaNacimiento(fechaNacimiento)
        );
    }

}
