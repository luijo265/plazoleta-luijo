package com.pragma.powerup.infrastructure.out.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private BigInteger id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 100, nullable = false)
    private String apellido;
    @Column(length = 100, nullable = false)
    private String identificacion;
    @Column(length = 30, nullable = false)
    private String celular;
    @Column(length = 200, nullable = false)
    private String correo;
    @Column(length = 500, nullable = false)
    private String clave;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(length = 50, name = "rol_tag")
    private String rol;

}
