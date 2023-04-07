package com.backend.menus;

import com.backend.principal.Usuario;
import com.frontend.ventanaymenus.PuntajesPanel;
import com.frontend.ventanaymenus.FramePrincipal;

/**
 *
 * @author michael
 */
public class MenuPrincipal {

    private boolean validarPrimerJuego = true;
    
    Usuario jugador = new Usuario("", 0);
    //JFramePrincipal ventana = new JFramePrincipal();
    FramePrincipal ventana = new FramePrincipal();

    public void mostrarVentana() {
        String nombre = null;
        ventana.setVisible(true);
        registrarJugador();
    }
    
    public void registrarJugador() {
        //jugador.setNombre(ventana.getNombre());
        PuntajesPanel copiaDatos = new PuntajesPanel();
        copiaDatos.copiarDatos(jugador.getNombre(), jugador.getPuntos());
    }
}