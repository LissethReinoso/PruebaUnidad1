/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Testigo;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorTestigo extends Controlador<Testigo> {

    public ControladorTestigo(List<Testigo> LGenerica) {
        super(LGenerica);
    }

    @Override
    public boolean validar(Testigo obj) {
       
        
        return true;
    }
    
    
    
    
    
    
    
}
