package com.pragma.powerup.domain.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CalculoEdadUtil {

    private CalculoEdadUtil(){}

    public static int obtenerEdad(LocalDateTime fecha){
        return Period.between(fecha.toLocalDate(), LocalDate.now()).getYears();
    }
    
}
