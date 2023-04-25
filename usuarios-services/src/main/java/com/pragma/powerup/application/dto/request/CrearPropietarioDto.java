package com.pragma.powerup.application.dto.request;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class CrearPropietarioDto {

    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String identification;
    @NotNull
    private String cellPhone;

    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private LocalDate birthDate;
    
}
