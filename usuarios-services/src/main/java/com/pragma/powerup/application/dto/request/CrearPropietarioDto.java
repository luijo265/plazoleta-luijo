package com.pragma.powerup.application.dto.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CrearPropietarioDto {

    private String name;
    private String lastName;
    private String identification;
    private String cellPhone;
    private String email;
    private String password;
    private LocalDateTime birthDate;
    
}
