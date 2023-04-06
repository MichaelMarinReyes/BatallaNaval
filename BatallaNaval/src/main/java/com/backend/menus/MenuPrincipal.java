package com.backend.menus;

import com.backend.principal.Usuario;
import com.frontend.ventanaprincipal.JFramePrincipal;

/**
 *
 * @author michael
 */
public class MenuPrincipal {

    private boolean validarPrimerJuego = true;
    
    Usuario jugador = new Usuario("", 0);
    JFramePrincipal ventana = new JFramePrincipal();

    public void mostrarVentana() {
        String nombre = null;
        ventana.setVisible(true);
        registrarJugador();
    }
    
    public void registrarJugador() {
        jugador.setNombre(ventana.getNombre());
    }
}