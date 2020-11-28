/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Novio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public abstract class Controlador<T> {
    
    
    private List <T>LGenerica;
    private Novio n;

    public List<T> getLGenerica() {
        return LGenerica;
    }

    public void setLGenerica(List<T> LGenerica) {
        this.LGenerica = LGenerica;
    }
    
    
    public Controlador(List<T> LGenerica) {
        LGenerica = new ArrayList<>();
    }
    
    
    public void registrar(T obj) {
       
        LGenerica.add(obj);
    }
    
    
    public T verPersona(T obj) {
       
        return (T) LGenerica.stream().filter((e)->e.equals(obj)).findFirst().get();
             
    }
    
    public void update(T obj) {
       for (int i = 0; i < LGenerica.size(); i++) {
            obj = LGenerica.get(i);
            if (n.getCedula().equals(i)) {
                LGenerica.set(i, obj);
                break;
            }
        }
    }
    
    
    public void delete(T novio) {
       
        LGenerica.remove(novio);
        
    }
    
     public List<T> findAll() {
      return LGenerica;
    }
    
     public void Almacenamiento(String r) throws IOException {
        FileInputStream file = new FileInputStream(r);
        
        ObjectInputStream datos = new ObjectInputStream(file);
        
        try {
            LGenerica = (List<T>) datos.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
    public void guardar(String r) throws IOException {
        FileOutputStream archivo = new FileOutputStream(r);
        
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(LGenerica);
    }
    
    public abstract boolean validar(T obj);
    
    
    
    
    
    
    
    
    
}
