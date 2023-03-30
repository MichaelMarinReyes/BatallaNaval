package com.backend.principal;

import com.frontend.ventanaprincipal.FramePrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class DinamicaJuego {

    Usuario jugador = new Usuario("", 0);
    FramePrincipal ventana = new FramePrincipal();

    public void comenzarJuego() {
        String nombre = null;
        ventana.setVisible(true);
        jugador.setNombre(        JOptionPane.showInputDialog(nombre));
    }
}
