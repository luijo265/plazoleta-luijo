package com.pragma.powerup.domain.model;

import java.time.LocalDateTime;

import com.pragma.powerup.domain.constantes.UsuarioConstante;
import com.pragma.powerup.domain.exception.ValidacionAtributoException;
import com.pragma.powerup.domain.util.CalculoEdadUtil;
import com.pragma.powerup.domain.util.ValidacionUtil;

public abstract class UsuarioModel {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String celular;
    private String correo;
    private String clave;
    private LocalDateTime fechaNacimiento;

    private String rol;

    protected UsuarioModel(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (ValidacionUtil.isCampoInvalido(nombre, UsuarioConstante.LONGITUD_NOMBRE)){
            throw new ValidacionAtributoException("Campo nombre no es válido", "nombre", "Campo no válido");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (ValidacionUtil.isCampoInvalido(apellido, UsuarioConstante.LONGITUD_APELLIDO)){
            throw new ValidacionAtributoException("Campo apellido no es válido", "apellido", "Campo no válido");
        }
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (ValidacionUtil.isCampoInvalido(identificacion, UsuarioConstante.LONGITUD_IDENTIFICACION)){
            throw new ValidacionAtributoException("Campo identificacion no es válido", "identificacion", "Campo no válido");
        }
        if (ValidacionUtil.isCoincideExpresionRegular(identificacion, UsuarioConstante.EXPRESION_REGULAR_IDENTIFICAION)){
            throw new ValidacionAtributoException("Campo identificacion solo debe contener numeros", "identificacion", "Campo no válido");
        }
        this.identificacion = identificacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (ValidacionUtil.isCampoInvalido(celular, UsuarioConstante.LONGITUD_CELULAR)){
            throw new ValidacionAtributoException("Campo celular es requerido y maximo 13 caracteres", "celular", "Campo no válido");
        }
        if (!ValidacionUtil.isCoincideExpresionRegular(celular, UsuarioConstante.EXPRESION_REGULAR_CELULAR)){
            throw new ValidacionAtributoException("Campo celular no es válido", "celular", "Campo no válido");
        }
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (ValidacionUtil.isCampoInvalido(correo, UsuarioConstante.LONGITUD_CORREO)){
            throw new ValidacionAtributoException("Campo correo es requerido y no superar los 100 caracteres", "correo", "Campo no válido");
        }
        if (!ValidacionUtil.isCoincideExpresionRegular(correo, UsuarioConstante.EXPRESION_REGULAR_EMAIL)){
            throw new ValidacionAtributoException("Campo correo no es válido", "correo", "Campo no válido");
        }
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        if (ValidacionUtil.isCampoInvalido(clave, UsuarioConstante.LONGITUD_CLAVE)){
            throw new ValidacionAtributoException("Campo clave no es válido", "clave", "Campo no válido");
        }
        this.clave = clave;
    }


    public LocalDateTime getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        if(fechaNacimiento == null || LocalDateTime.now().compareTo(fechaNacimiento) < 0){
            throw new ValidacionAtributoException("El campo fechaNacimiento no es valido", "fechaNacimiento", "El campo no valido");
        }
        if(CalculoEdadUtil.obtenerEdad(fechaNacimiento) < UsuarioConstante.MAYOR_EDAD){
            throw new ValidacionAtributoException("El usuario no es mayor de edad", "fechaNacimiento", "No cumple condicion de edad");
        }
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol){
        if (!isSuRolTag(rol)){
            throw new ValidacionAtributoException("Campo role no es válido", "clave", "Campo no válido");
        }
        this.rol = rol;
    }

    protected abstract boolean isSuRolTag(String rol);
}
