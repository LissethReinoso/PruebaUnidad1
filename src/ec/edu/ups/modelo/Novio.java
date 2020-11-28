/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public abstract class Novio <T>{
    
    private T nombre;
    private T apellido;
    private T cedula;
    private T direccion;
    private T genero;
    private Date fechaDeNacimiento;
    private Testigo testigo;
    private Autoridad autoridad;
    //Agregacion
    private List<Testigo> testigos;
    
    
    public Novio() {
     testigos = new ArrayList<>(); 
    }

    public Novio(T nombre, T apellido, T cedula, T direccion, T genero, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        testigos = new ArrayList<>(); 
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

    public T getGenero() {
        return genero;
    }

    public void setGenero(T genero) {
        this.genero = genero;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

   
    public boolean agregarTestigo(Testigo t) {
        return this.testigos.add(new Testigo(t.getNombre(),t.getApellido(),t.getCedula(),t.getDireccion(),t.getFechaDeNacimiento()));
    }
    
    
     
    public boolean validarM(){
        
        return true;
    }
    
   
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion=" + direccion + ", genero=" + genero + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
