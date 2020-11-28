/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface Iterator {
    
    public boolean validar();
    public List<Novio> listarN();
     public List<Testigo> listarT();
}
