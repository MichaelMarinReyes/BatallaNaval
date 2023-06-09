/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.frontend.ventanaymenus;

import com.backend.principal.Archivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author michael
 */
public class PuntajesPanel extends javax.swing.JPanel {

    private String nombre;
    private int puntos;
    private String accion = "Probando acciónes";
    private Archivo archivos = new Archivo();

    /**
     * Creates new form PanelPuntajes
     */
    public PuntajesPanel() {
        initComponents();
        mostrarPuntajes();
        mostrarHistorial();
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JTabbedPane();
        punteosPanel = new javax.swing.JPanel();
        historialPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        panelContenedor.setBackground(new java.awt.Color(153, 153, 153));
        panelContenedor.setForeground(new java.awt.Color(0, 0, 0));

        punteosPanel.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout punteosPanelLayout = new javax.swing.GroupLayout(punteosPanel);
        punteosPanel.setLayout(punteosPanelLayout);
        punteosPanelLayout.setHorizontalGroup(
            punteosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        punteosPanelLayout.setVerticalGroup(
            punteosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        panelContenedor.addTab("Punteos", punteosPanel);

        historialPanel.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout historialPanelLayout = new javax.swing.GroupLayout(historialPanel);
        historialPanel.setLayout(historialPanelLayout);
        historialPanelLayout.setHorizontalGroup(
            historialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        historialPanelLayout.setVerticalGroup(
            historialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        panelContenedor.addTab("Historial", historialPanel);

        add(panelContenedor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel historialPanel;
    private javax.swing.JTabbedPane panelContenedor;
    private javax.swing.JPanel punteosPanel;
    // End of variables declaration//GEN-END:variables

    public void copiarDatos(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    private void mostrarPuntajes() {
        archivos.crearArchivoWar(this.nombre, this.puntos);
        JTextArea historial = new JTextArea(archivos.leerWar());
        historial.setText(archivos.leerWar());
        //historial.setBackground(Color.LIGHT_GRAY);
        JScrollPane scroll = new JScrollPane(historial, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        punteosPanel.removeAll();
        punteosPanel.setLayout(new BorderLayout());
        punteosPanel.add(scroll);
    }

    private void mostrarHistorial() {
        archivos.crearArchivoAvn(this.nombre, this.getAccion());
        JTextArea registros = new JTextArea(archivos.leerArchivoAvn());
        registros.setText(archivos.leerArchivoAvn());
        //registros.setBackground(Color.LIGHT_GRAY);
        JScrollPane scroll = new JScrollPane(registros, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        historialPanel.removeAll();
        historialPanel.setLayout(new BorderLayout());
        historialPanel.add(scroll);
    }

}
