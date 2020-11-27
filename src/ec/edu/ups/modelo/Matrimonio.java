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
public class Matrimonio <T>{
    
    private T codigo;
    private T fecha;
    private T lugar;
    private Persona persona;
    
    
    //Agregacion
    private List<Persona> personas;
    
    public Matrimonio() {
        personas = new ArrayList<>();
    }

    public Matrimonio(T codigo, T fecha, T lugar) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.lugar = lugar;
        personas = new ArrayList<>();
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }

    public T getFecha() {
        return fecha;
    }

    public void setFecha(T fecha) {
        this.fecha = fecha;
    }

    public T getLugar() {
        return lugar;
    }

    public void setLugar(T lugar) {
        this.lugar = lugar;
    }
    
    
    //metodos
    public boolean agregarPersona(Persona persona) {
        return this.personas.add(new Persona( persona.getNombre(),persona.getApellido() ,persona.getCedula(),persona.getDireccion(), persona.getGenero(), persona.getFechaDeNacimiento(),persona.getFuncion()));
    }
    
    
    
    
    @Override
    public String toString() {
        return "codigo=" + codigo + ", fecha=" + fecha + ", lugar=" + lugar + '}';
    }

    
    
    
    
    
    
}
