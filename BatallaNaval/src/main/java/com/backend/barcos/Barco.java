package com.backend.barcos;

/**
 *
 * @author michael
 */
public class Barco {
    private String nombre;
    private int tamaño;
    private String imagen;
    private boolean destruido = false;
    
    public Barco(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    
    public boolean verificarDestruido(int golpes) {
        return golpes == tamaño;
    }
    
}
