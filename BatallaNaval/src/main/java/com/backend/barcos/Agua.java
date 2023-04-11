package com.backend.barcos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Agua {

    private String imagenAgua = "/src/main/resources/com/imagenes/agua.jpg";
    private Image imagen;
    public Agua() {
        imagen = new ImageIcon(getClass().getResource("/com/imagenes/imagenBatallaNaval.png")).getImage();
        
    }

    public void mostrarImagen() {
        
    }
    
}
