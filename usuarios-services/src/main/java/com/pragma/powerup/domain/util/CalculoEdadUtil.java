package com.pragma.powerup.domain.util;

import java.time.LocalDate;
import java.time.Period;

public class CalculoEdadUtil {

    private CalculoEdadUtil(){}

    public static int obtenerEdad(LocalDate fecha){
        return Period.between(fecha, LocalDate.now()).getYears();
    }
    
}
