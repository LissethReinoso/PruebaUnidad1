/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Matrimonio <T>{
    
    private T codigo;
    private T fecha;
    private T lugar;
    private Novio novio;
    private Testigo testigo;
    private Autoridad autoridad;
    
    //Agregacion
    private List<Novio> novios;
    private List<Testigo> testigos;
    
    public Matrimonio() {
       novios = new ArrayList<>();
       testigos = new ArrayList<>();
    }

    public Matrimonio(T codigo, T fecha, T lugar) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.lugar = lugar;
        novios = new ArrayList<>();
        testigos = new ArrayList<>();
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
    
    //métodos de la agregación
    public boolean agregarNovio(Novio n) {
        return this.novios.add(new Novio(n.getNombre(),n.getApellido(),n.getCedula(),n.getGenero(),n.getDireccion(),n.getFechaDeNacimiento()));
    }
    
    

    
    @Override
    public String toString() {
        return "codigo=" + codigo + ", fecha=" + fecha + ", lugar=" + lugar + '}';
    }

    
    
    
    
    
    
}
