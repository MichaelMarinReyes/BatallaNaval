package com.backend.principal;

import com.frontend.ventanaprincipal.JFramePrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class MenuPrincipal {

    private boolean validarPrimerJuego = true;
    
    Usuario jugador = new Usuario("", 0);
    JFramePrincipal ventana = new JFramePrincipal();

    public void comenzarJuego() {
        String nombre = null;
        ventana.setVisible(true);
        registrarJugador();
    }
    
    public void registrarJugador() {
        jugador.setNombre(ventana.getNombre());
    }
    
    public void crearNuevaPartida() {
        if (validarPrimerJuego == true) {
           
        } else {
        }
    }
}
