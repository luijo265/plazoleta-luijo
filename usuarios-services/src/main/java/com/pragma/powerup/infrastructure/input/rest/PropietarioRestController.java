package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.CrearPropietarioDto;
import com.pragma.powerup.application.dto.response.PropietarioCreadoDto;
import com.pragma.powerup.application.handler.IPropietarioHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/propietarios")
@RequiredArgsConstructor
public class PropietarioRestController {

    private final IPropietarioHandler propietarioHandler;
    @PostMapping(path = "/crear-propietario", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PropietarioCreadoDto> crearPropietario(@Valid @RequestBody CrearPropietarioDto propietarioDto) throws Exception {
        return ResponseEntity.status(HttpStatus.CREATED).body(propietarioHandler.crearPropietario(propietarioDto));
    }

}
