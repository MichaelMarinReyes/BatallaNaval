package com.backend.bombas;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Hecatombe extends Bomba {

    public Hecatombe(int tamaño) {
        super(tamaño);
        ImageIcon hecatombe = new ImageIcon(Bomba.IMAGEN_HECATOMBE);
        this.setIcon(new ImageIcon(hecatombe.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));

    }

    @Override
    public void moverBomba(int x, int y) {

    }

}
