package com.backend.barcos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Navio extends Barco {

    public Navio(int tamaño) {
        super(tamaño);
        super.nombre = "NAVIO";
        super.tamaño = 3;
        super.puntosGanados = 25; //POR PARTE
        ImageIcon navio = new ImageIcon(Barco.IMAGEN_NAVIO);
        this.setIcon(new ImageIcon(navio.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }

}
