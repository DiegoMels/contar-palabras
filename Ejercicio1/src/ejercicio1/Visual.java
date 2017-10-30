/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Visual extends JFrame {
    private JLabel lblPalabra1 = new JLabel("Primer Numero");
    private JLabel lblPalabra2 = new JLabel("Segundo Numero");
    private JLabel lblResultado = new JLabel("Resultado");
    private JTextField txtPalabra1 = new JTextField("");
    private JTextField txtPalabra2 = new JTextField("");
    private JTextField txtResultado = new JTextField("");
    private JButton calcular = new JButton("Calcular");
    private ControladorCalcular controladorCalcular = new ControladorCalcular(txtPalabra1, txtPalabra2, txtResultado);
    private GridLayout contenedor = new GridLayout (4, 2);

public Visual (){

        this.setSize(400, 400);
        this.setLayout(contenedor);
        this.setVisible(true);
        this.setTitle("Abecedario");
        this.setLocation(200, 200);
        this.calcular.addMouseListener(controladorCalcular);   
        this.add(lblPalabra1);
        this.add(txtPalabra1);
        this.add(lblPalabra2);
        this.add(txtPalabra2);
        this.add(lblResultado);
        this.add(txtResultado);
        this.add(calcular);
        
        
        
}

}

