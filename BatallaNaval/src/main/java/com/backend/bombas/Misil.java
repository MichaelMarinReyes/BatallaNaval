package com.backend.bombas;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Misil extends Bomba {

    public Misil(int tamaño) {
        super(tamaño);
        ImageIcon misil = new ImageIcon(Bomba.IMAGEN_MISIL);
        this.setIcon(new ImageIcon(misil.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));

    }

    @Override
    public void moverBomba(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
