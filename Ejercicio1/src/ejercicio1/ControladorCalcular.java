/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
class ControladorCalcular implements MouseListener {
    
    private JTextField primerPalabra, segundaPalabra, resultado;
    private DaoContador daoContador;

    ControladorCalcular(JTextField pPalabra1, JTextField pPalabra2, JTextField pResultado) {
        this.primerPalabra = pPalabra1;
        this.segundaPalabra = pPalabra2;
        this.resultado = pResultado;
        this.daoContador = new DaoContador(this.primerPalabra,this.segundaPalabra);
            
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
       resultado.setText(daoContador.CalcularPalabratotal().toString());
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
