package com.backend.principal;

/**
 *
 * @author michael
 */
public class Usuario {

    private String nombre;
    private int puntos = 0;

    public Usuario() {
    }

    public Usuario(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void aumentarPuntos(int puntosGanados) {
        this.setPuntos(this.getPuntos() + puntosGanados);
    }
}
