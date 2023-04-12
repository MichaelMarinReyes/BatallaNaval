package com.backend.barcos;

import com.backend.componentestablero.Casilla;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Barco extends Casilla {

    protected static final String IMAGEN_PAILEBOT = "/com/imagenes/pailebot.png";
    protected static final String IMAGEN_BERGANTIN = "/com/imagenes/bergantin.png";
    protected static final String IMAGEN_NAVIO = "/com/imagenes/navio.png";
    protected int tamaño;
    protected String nombre;
    private String imagen;
    protected int puntosGanados;
    private int cantidadGolpes = 0;
    private boolean destruido = false;

    public Barco(int tamaño) {
        super(tamaño);
        this.tamaño = tamaño;

    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public String getNombre() {
        return nombre;
    }
 
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCantidadGolpes() {
        return cantidadGolpes;
    }

    public void setCantidadGolpes(int cantidadGolpes) {
        this.cantidadGolpes = cantidadGolpes;
    }

    public void pintarBarco(Image foto) {
        ImageIcon barco = new ImageIcon(Agua.IMAGEN_AGUA);
        this.setIcon(new ImageIcon(barco.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }

    public boolean verificarDestruido(int golpes) {
        if (golpes == tamaño) {
            JOptionPane.showMessageDialog(null, "Has destruido " + this.getNombre());
            return true;
        } else if (golpes < 3) {
            cantidadGolpes++;
            return false;
        }
        return false;
    }

}
