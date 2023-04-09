package com.backend.componentestablero;

import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Tablero {

    private Casilla casillas[][];
    private Casilla mapas[][][];
    private int indiceMapas = 0;
    private String nombre;
    private int indiceNombre = 0;

    public Tablero() {
        mapas = new Casilla[10][][];
    }

    public boolean crearTablero(String[] lineas) throws IOException {
        try {
            for (int i = 0; i < lineas.length; i++) {
                String[] caracteres = lineas[i].split(",");
                for (int j = 0; j < caracteres.length; j++) {
                    casillas[i][j] = new Casilla(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);
                    casillas[i][j].setPosicionX(j);
                    casillas[i][j].setPosicionY(i);
                    //casillas[i][j].setTieneBomba(true) = caracteres[j].equalsIgnoreCase("O");
                }
            }
        } catch (IndexOutOfBoundsException ie) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema con las dimensiones");
            return false;
        }
        return true;
    }

    public void guardarMapas(Casilla[][] mapa) {
        for (int i = 0; i < mapas.length; i++) {
            if (mapas[i] == null) {
                
                mapas[i] = mapa;
            }
            
        }
    }
}
