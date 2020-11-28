/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.*;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorNovio extends Controlador<Novio>{

    public ControladorNovio(List<Novio> list) {
        super(list);
    }


    @Override
    public boolean validar(Novio obj) {
        return false;
    }
 
    
    
    
    
    
}
