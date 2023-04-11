package com.backend.principal;

import com.backend.componentestablero.Tablero;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Archivo {

    public void crearArchivoAvn(String nombreJugador, String nombreBomba, String accion, String hora) { //Registro del juego
        DataOutputStream data = null;
        try {
            data = new DataOutputStream(new FileOutputStream("Acciones.avn"));
            data.writeChars(nombreJugador);
            data.writeChars(nombreBomba);
            data.writeChars(accion);
            data.writeUTF(hora);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no existente " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema en el flujo " + ex.getMessage());
        } finally {
            try {
                data.close();
            } catch (IOException er) {
                er.printStackTrace();
            }
        }
    }

    public void leerArchivoTh(String nombreArchivo) { //Para crear mapas
        File f;
        BufferedReader br = null;
        String cadena;
        String[] verificarExtension = nombreArchivo.split("\\.");
        f = new File(verificarExtension[0] + ".th");
        Tablero nuevoTablero = null;
        int torpedos = 0;
        int misiles = 0;
        int hecatombes = 0;
        if (f.exists()) {
            try {
                br = new BufferedReader(new FileReader(f));
                while ((cadena = br.readLine()) != null) {
                    String id = " ";
                    if (cadena.contains("tablero") || cadena.contains("Tablero") || cadena.contains("TABLERO")) {
                       System.out.println(cadena);
                        String[] identificador = cadena.split("<<");
                        String[] nombreId = identificador[1].split(">>");
                        id = nombreId[0];
                        System.out.println(id);
                    } else if (cadena.contains("dimension") || cadena.contains("Dimension") || cadena.contains("DIMENSION")) {
                        String[] dimension1 = cadena.split(" ");
                        System.out.println(dimension1[1]);
                        String[] dimensiones = dimension1[1].split("X");
                        System.out.println("x "+dimensiones[0] + "\nY " + dimensiones[1]);

                        nuevoTablero = new Tablero(id, Integer.parseInt(dimensiones[0]), Integer.parseInt(dimensiones[1]));
                        nuevoTablero.crearTablero();
                        torpedos = 0;
                    }
                    /*else if (nuevoTablero != null) {
                        //nuevo.agregarLinea(cadena, conteo);
                        conteo++;
                    }*/
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo inexistente o nombre incorrecto");
        }
        
    }

    public void crearArchivoWar(String nombre, int puntos) { // para punteos
        String nombreArchivo = "Punteos";
        File war;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter escritor = null;
        String cadena;
        boolean existe;
        war = new File(nombreArchivo + ".war");
        if (war.exists()) {
            JOptionPane.showMessageDialog(null, "el archivo ya existe");
            existe = war.exists();
        } else {
            JOptionPane.showMessageDialog(null, "se creará el archivo");
            existe = war.exists();
        }
        try {
            escritor = new PrintWriter(new DataOutputStream(new FileOutputStream(war, true)));
            while ((cadena = entrada.readLine()) != null && cadena.length() > 0) {
                if (datosCorrectos(cadena)) {
                    escritor.println(cadena);
                }
            }
            escritor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "F");
            e.printStackTrace();
        }
    }

    private boolean datosCorrectos(String cadena) {

        return false;
    }
}
