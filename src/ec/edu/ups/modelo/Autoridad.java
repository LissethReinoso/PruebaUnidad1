/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Autoridad <T> {
    
    
    private T nombre;
    private T apellido;
    private T cedula;
    private T direccion;
    private T correo;
    private T contrasenia;
    private T fechaDeNacimiento;
     

    public Autoridad() {
    }

    public Autoridad(T nombre, T apellido, T cedula, T direccion, T correo, T contrasenia, T fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechaDeNacimiento = fechaDeNacimiento;
        
    }


    

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getApellido() {
        return apellido;
    }

    public void setApellido(T apellido) {
        this.apellido = apellido;
    }

    public T getCedula() {
        return cedula;
    }

    public void setCedula(T cedula) {
        this.cedula = cedula;
    }

    public T getDireccion() {
        return direccion;
    }

    public void setDireccion(T direccion) {
        this.direccion = direccion;
    }

    public T getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(T fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public T getCorreo() {
        return correo;
    }

    public void setCorreo(T correo) {
        this.correo = correo;
    }

    public T getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(T contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Autoridad{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion=" + direccion + ", correo=" + correo + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    
    
    
    
    
    
    
    
}
