package com.pragma.powerup.infrastructure.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseValidacionAtributoDto {

    private String message;
    private String field;

}
