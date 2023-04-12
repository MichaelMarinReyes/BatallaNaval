package com.backend.bombas;

import com.backend.componentestablero.Casilla;
import java.awt.Image;

/**
 *
 * @author michael
 */
public abstract class Bomba extends Casilla {

    private String tipo;
    private String nombre;
    private Image imagenBomba;
    private String imagenBombaDetonada;

    protected static final String IMAGEN_AGUA_DETONADA = "/com/imagenes/aguaDetonada.png";
    protected static final String IMAGEN_BOMBA = "/com/imagenes/bombaNormal.png";
    protected static final String IMAGEN_TORPEDO = "/com/imagenes/torpedo.png";
    protected static final String IMAGEN_MISIL = "/com/imagenes/misil.png";
    protected static final String IMAGEN_HECATOMBE = "/com/imagenes/hecatombe.png";

    public Bomba(int tamaño) {
        super(tamaño);
    }


    public abstract void moverBomba(int x, int y);

    public void detectarImpacto() {

    }

    public void mostrarTrayectoria() {

    }
}
