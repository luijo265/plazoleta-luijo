package com.pragma.powerup.infrastructure.exceptionhandler;

import com.pragma.powerup.domain.exception.ValidacionAtributoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestControllerAdvicer extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ValidacionAtributoException.class)
    public ResponseEntity handleValidacionAtributoException(ValidacionAtributoException ex, WebRequest request){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ResponseValidacionAtributoDto.builder()
                    .message(ex.getMessage())
                    .field(ex.getNombreAtributo())
                    .build()
                );
    }

}
