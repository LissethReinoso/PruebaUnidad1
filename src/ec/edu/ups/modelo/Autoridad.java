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
    private Date fechaDeNacimiento;
    private Matrimonio matrimonio;

    public Autoridad() {
    }

    public Autoridad(T nombre, T apellido, T cedula, T direccion, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
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

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Matrimonio getMatrimonio() {
        return matrimonio;
    }

    public void setMatrimonio(Matrimonio matrimonio) {
        this.matrimonio = matrimonio;
    }
    
    
    
    
    
    
}
