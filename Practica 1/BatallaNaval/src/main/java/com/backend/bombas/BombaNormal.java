package com.backend.bombas;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class BombaNormal extends Bomba {

    public BombaNormal(int tamaño) {
        super(tamaño);
        ImageIcon bomba = new ImageIcon(Bomba.IMAGEN_BOMBA);
        this.setIcon(new ImageIcon(bomba.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }

    @Override
    public void moverBomba(int x, int y) {
        
    }
    
}
