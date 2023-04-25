package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.CrearPropietarioDto;
import com.pragma.powerup.application.dto.response.PropietarioCreadoDto;
import com.pragma.powerup.application.handler.IPropietarioHandler;
import com.pragma.powerup.infrastructure.exceptionhandler.ResponseValidacionAtributoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @Operation(operationId = "crearPropietario", summary = "Crear propietario que se encargara gestionar su propio restaurante")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Propietario creado",
                content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = PropietarioCreadoDto.class)) }),
        @ApiResponse(responseCode = "400", description = "Datos del propietario no son válidos",
                content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ResponseValidacionAtributoDto.class)))
    })
    @PostMapping(path = "/crear-propietario", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PropietarioCreadoDto> crearPropietario(@Valid @RequestBody CrearPropietarioDto propietarioDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(propietarioHandler.crearPropietario(propietarioDto));
    }

}
