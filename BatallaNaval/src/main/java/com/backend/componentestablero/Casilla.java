package com.backend.componentestablero;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author michael
 */
public class Casilla extends JButton {
    private static final String IMAGEN_AGUA = "/com/imagenes/agua.jpg";
    private static final String IMAGEN_AGUA_DETONADA = "/com/imagenes/aguaDetonada.png";
    private static final String IMAGEN_BOMBA = "/com/imagenes/bombaNormal.png";
    private static final String IMAGEN_TORPEDO = "/com/imagenes/torpedo.png";
    private static final String IMAGEN_MISIL = "/com/imagenes/misil.png";
    private static final String IMAGEN_HECATOMBE = "/com/imagenes/hecatombe.png";
    private static final String IMAGEN_PAILEBOT = "/com/imagenes/pailebot.png";
    private static final String IMAGEN_BERGANTIN = "/com/imagenes/bergantin.png";
    private static final String IMAGEN_NAVIO = "/com/imagenes/navio.png";
    private boolean casillaUsada = false;
    private boolean tieneBomba = false;
    private Image imagen;
    private int tamaño;
    private int posicionX;
    private int posicionY;

    public Casilla(int tamaño) {
        this.tamaño = tamaño;
        this.imagen = new ImageIcon(getClass().getResource(IMAGEN_AGUA)).getImage();
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
        this.imagen = new ImageIcon(getClass().getResource(IMAGEN_PAILEBOT)).getImage();
    }
    
    public void revelarCasilla() {
        this.imagen = new ImageIcon(getClass().getResource(IMAGEN_NAVIO)).getImage();
    }
    
    public boolean tenerBarco() {
        return true;
    }
    
    
}
