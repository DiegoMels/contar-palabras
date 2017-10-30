/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class DaoContador {
    
    private JTextField primerPalabra, segundaPalabra;
    
     public DaoContador(JTextField parametroPP, JTextField parametroSP) {
        this.primerPalabra = parametroPP;
        this.segundaPalabra = parametroSP;
    }

    public Integer CalcularPalabratotal(){
     Integer palabratotal = primerPalabra.getText().length() + segundaPalabra.getText().length();
        return palabratotal;
    }
    
}
