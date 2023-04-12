package com.backend.barcos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Bergantin extends Barco {

    public Bergantin(int tamaño) {
        super(tamaño);
        super.nombre = "BERGANTIN";
        super.tamaño = 2;
        super.puntosGanados = 40; //POR PARTE
        ImageIcon bergantin = new ImageIcon(Barco.IMAGEN_BERGANTIN);
        this.setIcon(new ImageIcon(bergantin.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));

    }

}
