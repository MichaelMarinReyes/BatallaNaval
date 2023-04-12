package com.backend.menus;

import com.backend.componentestablero.Casilla;
import java.awt.event.ActionEvent;

/**
 *
 * @author michael
 */
public class IniciarPartida {
    
    
    
    
    
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() instanceof Casilla) {
            Casilla boton = new Casilla(50);
            boton.setEnabled(false);
        } else {
        }
    }
}
