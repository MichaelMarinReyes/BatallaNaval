package com.backend.bombas;

/**
 *
 * @author michael
 */
public abstract class Bomba {

    private String tipo;
    private String nombre;
    private String imagenBomba;
    private String imagenBombaDetonada;

    public Bomba() {
    }

    public abstract void moverBomba();

    public void detectarImpacto() {

    }

    public void mostrarTrayectoria() {

    }
}
