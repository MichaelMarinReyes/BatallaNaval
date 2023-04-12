package com.backend.barcos;

import com.backend.componentestablero.Casilla;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Agua extends Casilla {

    public static final String IMAGEN_AGUA = "/com/imagenes/agua.jpg";
    private String imagenAgua = "/src/main/resources/com/imagenes/agua.jpg";
    private Image imagen;

    public Agua(int tamaño) {
        super(tamaño);
        ImageIcon agua = new ImageIcon(IMAGEN_AGUA);
        this.setIcon(new ImageIcon(agua.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));

    }

    public void mostrarImagen() {

    }

}
