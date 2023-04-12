package com.backend.componentestablero;

import com.backend.barcos.Agua;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author michael
 */
public class Casilla extends JButton {

    private boolean casillaUsada = false;
    private boolean tieneBomba = false;
    private Image imagen;
    private int tamaño;
    private int posicionX;
    private int posicionY;

    public Casilla(int tamaño) {
        this.tamaño = tamaño;
        this.imagen = new ImageIcon(getClass().getResource(Agua.IMAGEN_AGUA)).getImage();
        this.setSize(tamaño, tamaño);
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean isTieneBomba() {
        return tieneBomba;
    }

    public void setTieneBomba(boolean tieneBomba) {
        this.tieneBomba = tieneBomba;
    }
    
    
    public void cambiarImagen(String path) {
        this.imagen = new ImageIcon(getClass().getResource(Agua.IMAGEN_AGUA)).getImage();
    }
    
    public void revelarCasilla() {
        this.imagen = new ImageIcon(getClass().getResource(Agua.IMAGEN_AGUA)).getImage();
    }
    
    public boolean tenerBarco() {
        return true;
    }
    
    
}
