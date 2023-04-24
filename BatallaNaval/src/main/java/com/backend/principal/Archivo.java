package com.backend.principal;

import com.backend.componentestablero.Tablero;
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
    private String pathWar;

    public void crearArchivoAvn(String nombreJugador, String accion) { //Registro del juego
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
                linea.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
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
                linea.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
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
        //leerArchivoAvn();
    }

    public String leerArchivoAvn() {
        File arhivo;
        BufferedReader bufer = null;
        String cadena;
        String texto = "";
        arhivo = new File(pathAvn);
        if (arhivo.exists()) {
            try {
                bufer = new BufferedReader(new FileReader(arhivo));
                int contador = 1;
                while ((cadena = bufer.readLine()) != null) {
                    texto += contador + " " + cadena + "\n";
                    contador++;
                }
                bufer.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo Inexistente");
        }
        return texto;
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
                JOptionPane.showMessageDialog(null, e.getMessage());
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
                linea.print("***PUNTEOS***");
                linea.print("USUARIO: " + nombre);
                linea.println(", PUNTOS: " + puntos);
                linea.close();
                escribir.close();
            } else {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.print("USUARIO: " + nombre);
                linea.println(", PUNTOS: " + puntos);
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
        pathWar = archivo.getAbsolutePath();
    }

    public String leerWar() {
        File arhivoLeido;
        BufferedReader bufer = null;
        String cadena;
        String texto = "";
        arhivoLeido = new File(pathWar);
        if (arhivoLeido.exists()) {
            try {
                bufer = new BufferedReader(new FileReader(arhivoLeido));
                int contador = 1;
                while ((cadena = bufer.readLine()) != null) {
                    texto += contador + " " + cadena + "\n";
                    contador++;
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo inexistente");
        }
        return texto;
    }
}
