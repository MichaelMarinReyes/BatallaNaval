package com.backend.principal;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
        File arhivo;
        BufferedReader bufer = null;
        String cadena;
        arhivo = new File(nombreArchivo + ".avn");
        
        if (arhivo.exists()) {
            int conteo = 1;
            try {
                bufer = new BufferedReader(new FileReader(arhivo));
                while ((cadena = bufer.readLine()) != null) {
                    System.out.println(cadena);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado o nombre incorrecto");
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
