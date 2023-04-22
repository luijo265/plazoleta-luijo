package com.pragma.powerup.application.dto.request;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
