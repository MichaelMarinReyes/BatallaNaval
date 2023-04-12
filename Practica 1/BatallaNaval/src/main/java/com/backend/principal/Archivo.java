package com.backend.principal;

import com.backend.componentestablero.Tablero;
import com.frontend.ventanaymenus.PuntajesPanel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Archivo {

    private String pathAvn;

    public void crearArchivoAvn(String nombreJugador, String accion, LocalTime hora) { //Registro del juego
        File archivo = null;
        FileWriter escribir = null;
        PrintWriter linea = null;
        try {
            archivo = new File("Acciones.avn");
            if (!archivo.exists()) {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.print("USUARIO: ");
                linea.print(nombreJugador + ", ");
                linea.print("ACCIÓN: ");
                linea.print(accion + ", ");
                linea.print("HORA: ");
                linea.println(hora.getHour() + ":" + hora.getMinute());
                linea.close();
                escribir.close();
            } else {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.print("USUARIO: ");
                linea.print(nombreJugador + ", ");
                linea.print("ACCIÓN: ");
                linea.print(accion + ", ");
                linea.print("HORA: ");
                linea.println(hora.getHour() + ":" + hora.getMinute());
                linea.close();
                escribir.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no existente " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema en el flujo " + ex.getMessage());
        } finally {
            try {
                escribir.close();
                linea.close();
            } catch (IOException er) {
                er.printStackTrace();
            }
        }
        pathAvn = archivo.getAbsolutePath();
        leerArchivoAvn(pathAvn);
    }

    public void leerArchivoAvn(String path) {
        File arhivo;
        BufferedReader bufer = null;
        String cadena;
        String texto = "";
        String temp = "";
        arhivo = new File(path);
        if (arhivo.exists()) {
            int conteo = 1;
            try {
                bufer = new BufferedReader(new FileReader(arhivo));
                while ((cadena = bufer.readLine()) != null) {
                    PuntajesPanel puntajes = new PuntajesPanel();
                    puntajes.mostrarContenido(cadena);
                }
                texto = temp;
            } catch (IOException e) {
                //System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo Inexistente");
        }
    }
    public void leerArchivoTh(String nombreArchivo) { //Para crear mapas
        File f;
        BufferedReader br = null;
        String cadena;
        String[] verificarExtension = nombreArchivo.split("\\.");
        f = new File(verificarExtension[0] + ".th");
        Tablero nuevoTablero = null;

        if (f.exists()) {
            try {
                br = new BufferedReader(new FileReader(f));
                while ((cadena = br.readLine()) != null) {
                    String id = " ";
                    if (cadena.contains("tablero") || cadena.contains("Tablero") || cadena.contains("TABLERO")) {
                        String[] identificador = cadena.split("<<");
                        String[] nombreId = identificador[1].split(">>");
                        id = nombreId[0];
                    } else if (cadena.contains("dimension") || cadena.contains("Dimension") || cadena.contains("DIMENSION")) {
                        String[] dimension1 = cadena.split(" ");
                        String[] dimensiones = dimension1[1].split("X");

                        nuevoTablero = new Tablero(id, Integer.parseInt(dimensiones[0]), Integer.parseInt(dimensiones[1]));
                        nuevoTablero.crearTablero(cadena.split(","));
                    }
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
        File archivo = null;
        FileWriter escribir = null;
        PrintWriter linea = null;
        try {
            archivo = new File(nombreArchivo + ".war");
            if (!archivo.exists()) {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.print("USUARIO, ");
                linea.println("PUNTOS");
                linea.print(nombre + ", ");
                linea.println(puntos);
                linea.close();
                escribir.close();
            } else {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.print(nombre + ", ");
                linea.println(puntos);
                linea.close();
                escribir.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no existente " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema en el flujo " + ex.getMessage());
        } finally {
            try {
                escribir.close();
                linea.close();
            } catch (IOException er) {
                er.printStackTrace();
            }
        }

        File arhivoLeido;
        BufferedReader bufer = null;
        String cadena;
        String texto = "";
        String temp = "";
        arhivoLeido = new File(archivo.getAbsolutePath());
        if (arhivoLeido.exists()) {
            int conteo = 1;
            try {
                bufer = new BufferedReader(new FileReader(arhivoLeido));
                while ((cadena = bufer.readLine()) != null) {
                    PuntajesPanel puntajes = new PuntajesPanel();
                    puntajes.mostrarContenido(cadena);
                }
                texto = temp;
            } catch (IOException e) {
                //System.out.println(e.getMessage());
            }
        } else {
           JOptionPane.showMessageDialog(null, "Archivo inexistente");
        }
    }

    private boolean datosCorrectos(String cadena) {

        return false;
    }
}
