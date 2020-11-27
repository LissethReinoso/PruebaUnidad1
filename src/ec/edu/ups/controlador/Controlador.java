/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Novio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public abstract class Controlador<T> {
    
    
    private List <T>LGenerica;
    private Novio n;
    public Controlador(List<T> LGenerica) {
        LGenerica = new ArrayList<>();
    }
    
    
    public void create(T novio) {
       
        LGenerica.add(novio);
    }
    
    public Novio iniciarSesion(String cedula){
         
         return null;
     }
    
    public T verPersona(T novio) {
       
        return (T) LGenerica.stream().filter((e)->e.equals(novio)).findFirst().get();
             
    }
    
    public void update(T novio) {
       for (int i = 0; i < LGenerica.size(); i++) {
            novio = LGenerica.get(i);
            if (n.getCedula().equals(i)) {
                LGenerica.set(i, novio);
                break;
            }
        }
    }
    
    
    public void delete(T novio) {
       
        LGenerica.remove(novio);
        
    }
    
    
    
    
    
    
    
}
