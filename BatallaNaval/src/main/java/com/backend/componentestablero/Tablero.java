package com.backend.componentestablero;

import com.backend.barcos.*;
import com.backend.bombas.*;
import com.frontend.ventanaymenus.NuevaPartidaPanel;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Tablero {

    private Casilla casillas[][];
    private Casilla mapas[][][];
    private Casilla boton;
    private Barco[] barcos;
    private int filas;
    private int columnas;
    private int indiceMapas = 0;
    private String nombre;
    private int indiceNombre = 0;

    public Tablero(String id, int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.casillas = new Casilla[filas][columnas];
        mapas = new Casilla[10][][];
    }

    public JButton[][] crearTablero() {
        int tamaño = 100;
        int posicionX = 10;
        int posicionY = 10;
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla(tamaño);
                casillas[i][j].setBounds(posicionX, posicionY, 100, 100);
                NuevaPartidaPanel panelNueva = new NuevaPartidaPanel();
                panelNueva.mostrarTablero(casillas);
                posicionX += 160;
            }
            posicionX = 10;
            posicionY += 70;
        }
        return casillas;
    }

    public boolean crearTablero(String[] lineas) throws IOException {
        try {
            for (int i = 0; i < lineas.length; i++) {
                String[] caracteres = lineas[i].split(",");
                for (int j = 0; j < caracteres.length; j++) {
                    casillas[i][j] = new Casilla(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);
                    casillas[i][j].setPosicionX(j);
                    casillas[i][j].setPosicionY(i);

                    if (caracteres[j].equals("~")) {
                        casillas[i][j] = new Agua(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);

                    } else if (caracteres[j].equals("T")) {
                        casillas[i][j] = new BombaNormal(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);
                        casillas[i][j].setTieneBomba(true);
                        
                    } else if (caracteres[i].equals("I")) {
                        casillas[i][j] = new Misil(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);
                        casillas[i][j].setTieneBomba(true);
                    
                    } else if (caracteres[i].equals("O")) {
                        casillas[i][j] = new Hecatombe(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);
                        casillas[i][j].setTieneBomba(true);
                        
                    } else if (caracteres[i].equals("B1")) {
                        casillas[i][j] = new Pailebot(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);

                    } else if (caracteres[i].equals("B2")) {
                        casillas[i][j] = new Bergantin(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);

                    } else if (caracteres[i].equals("B3")) {
                        casillas[i][j] = new Navio(((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / casillas.length)) * 2 / 3);
                        
                    }
                }
                guardarMapas(casillas);
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
        indiceMapas++;
    }

    public void guardarId(String id) {
        this.nombre = id;
    }
}
