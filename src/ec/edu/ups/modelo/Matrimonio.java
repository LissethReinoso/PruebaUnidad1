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
public class Matrimonio <T> implements Iterator{
    
    
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

    public Matrimonio( T fecha, T lugar) {
        
        this.fecha = fecha;
        this.lugar = lugar;
        novios = new ArrayList<>();
        testigos = new ArrayList<>();
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
        return this.novios.add(new Novio(n.getNombre(),n.getApellido(),n.getCedula(),n.getGenero(),n.getDireccion(),n.getFechaDeNacimiento()) {});
    }
    
    
    
    

    
    @Override
    public String toString() {
        return fecha + ", lugar=" + lugar + '}';
    }

    @Override
    public boolean validar() {
      
         boolean bandera = false;
         for(int i=0;i<novios.size();i++){
            
            bandera= true;
       
         }
         
         for(int i=0;i<testigos.size();i++){
            
            bandera= true;
    
         }
         
        return bandera;   
    }

 

    @Override
    public List<Novio> listarN() {
        
        for(int i=0;i<novios.size();i++){
            novios.stream().forEach((n)-> {
            System.out.println(n.getCedula());
            System.out.println(n.getNombre());
            System.out.println(n.getApellido());
            System.out.println(n.getGenero());
            System.out.println(n.getDireccion());
            System.out.println(n.getFechaDeNacimiento());
                
         });
                    }
        return novios;
    }

    @Override
    public List<Testigo> listarT() {
     
        for(int i=0;i<testigos.size();i++){
            testigos.stream().forEach((t)-> {
            System.out.println(t.getCedula());
            System.out.println(t.getNombre());
            System.out.println(t.getApellido());
            System.out.println(t.getDireccion());
            System.out.println(t.getFechaDeNacimiento());
                
         });
                    }
        return testigos;
    }

    

    
    
    
    
    
    
}
