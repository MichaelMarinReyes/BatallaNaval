package com.backend.barcos;

import com.backend.bombas.Bomba;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Pailebot extends Barco {

    public Pailebot(int tamaño) {
        super(tamaño);
        super.nombre = "PAILEBOT";
        super.tamaño = 1;
        super.puntosGanados = 100;
        ImageIcon pailebot = new ImageIcon(Barco.IMAGEN_PAILEBOT);
        this.setIcon(new ImageIcon(pailebot.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));

    }

}
