package com.pragma.powerup.domain.model;

import com.pragma.powerup.domain.exception.ValidacionAtributoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
public class PropietarioModelTest {

    private PropietarioModel propietarioModel;

    @BeforeEach
    public void setUp(){
        propietarioModel = new PropietarioModel();
    }

    @Test
    public void tieneRolPropietario(){
        propietarioModel.setRol("propietario");
        assertEquals(PropietarioModel.ROL_TAG, propietarioModel.getRol());
    }

    @Test
    public void noTieneRolPropietario(){
        assertThrows(ValidacionAtributoException.class, () -> propietarioModel.setRol("admin"));
    }

    @Test
    public void guardandoNombre(){
        propietarioModel.setNombre("Luis");
        assertNotNull(propietarioModel.getNombre());
    }

    @Test
    public void errorGuardandoNombre(){
        assertThrows(ValidacionAtributoException.class, () ->  propietarioModel.setNombre(null));
    }

    @Test
    public void guardandoCelularSinPrefijo(){
        propietarioModel.setCelular("3054469926");
        assertNotNull(propietarioModel.getCelular());
    }

    @Test
    public void guardandoCelularConPrefijo(){
        propietarioModel.setCelular("+573054469926");
        assertNotNull(propietarioModel.getCelular());
    }

    @Test
    public void errorGuardandoCelularVacio(){
        assertThrows(ValidacionAtributoException.class, () -> propietarioModel.setCelular(""));
    }

    @Test
    public void errorGuardandoCelularNoValido(){
        assertThrows(ValidacionAtributoException.class, () -> propietarioModel.setCelular("30544699269"));
    }

    @Test
    public void guardandoFechaNacimiento(){
        propietarioModel.setFechaNacimiento(LocalDateTime.of(1991, 6, 4, 0, 0, 0));
        assertNotNull(propietarioModel.getFechaNacimiento());
    }

    @Test
    public void errorGuardandoFechaNacimiento(){
        assertThrows(
            ValidacionAtributoException.class, 
            () -> propietarioModel.setFechaNacimiento(LocalDateTime.of(2020, 6, 4, 0, 0, 0))
        );
    }

}
