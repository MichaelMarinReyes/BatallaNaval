package com.frontend.ventanaymenus;

import com.backend.principal.Archivo;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author michael
 */
public class ColeccionTablerosPanel extends javax.swing.JPanel {

    private JTextArea texto;

    BorderLayout borderLayout = new BorderLayout();

    /**
     * Creates new form ColeccionTablerosPanel
     */
    public ColeccionTablerosPanel() {
        initComponents();
        setVisible(true);
        panelBotones.setBackground(Color.DARK_GRAY);
        mostrarMapas(mostrarMensajeDeCargaDeArchivo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelBotones = new javax.swing.JPanel();
        botonCargar = new javax.swing.JButton();
        panelVisualizador = new javax.swing.JPanel();

        panelBotones.setLayout(new java.awt.GridBagLayout());

        botonCargar.setText("Cargar Mapa");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 12, 0);
        panelBotones.add(botonCargar, gridBagConstraints);

        javax.swing.GroupLayout panelVisualizadorLayout = new javax.swing.GroupLayout(panelVisualizador);
        panelVisualizador.setLayout(panelVisualizadorLayout);
        panelVisualizadorLayout.setHorizontalGroup(
            panelVisualizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelVisualizadorLayout.setVerticalGroup(
            panelVisualizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelVisualizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVisualizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        Archivo archivo = new Archivo();
        archivo.leerArchivoTh(chooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_botonCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelVisualizador;
    // End of variables declaration//GEN-END:variables

    public JTextArea mostrarMensajeDeCargaDeArchivo() {
        String mensajeInformativo = "Debe de subir un archivo con extensión \".th\", el formato debe ser el siguiente:”\n\n"
                + "		“~ Indica la posicion de una casilla normal de agua.”\n"
                + "		“B1 Indica la posición del barco de tamaño de una casilla”\n"
                + "		“B2 Indica la posición del barco de tamaño de dos casillas”\n"
                + "		“B3 Indica la posición del barco de tamaño de tres casillas”\n"
                + "		“T Indica la posición de una bomba tipo torpedo”\n"
                + "		“I Indica la posición de una bomba tipo misil”\n"
                + "		“O Indica la posición de una bomba tipo hecatombe”\n"
                + "		“«id» Indica el número o palabra con el que se identificará el mapa, el nombre definido en un mapa no puede repetirse.\n"
                + "              \nEstructura en el archivo\n\n"
                + "             tablero <<id>>\n"
                + "             dimension 5x5\n"
                + "             ~,B3,~,B1,~\n"
                + "             ~,B3,~,B2,B2\n"
                + "             ~,B3,~,T,~\n"
                + "             I,~,O,~,~\n"
                + "             ~,~,~,~,~\n"
                + "\nRECUERDE GUARDAR EL MAPA CON EXTENSION \".th\"";

        texto = new JTextArea(mensajeInformativo);
        texto.setBounds(50, 50, 300, 200);
        texto.setEditable(false);
        return texto;
    }

    private void mostrarMapas(JComponent texto) {
        panelVisualizador.setLayout(borderLayout);
        panelVisualizador.setBackground(Color.LIGHT_GRAY);
        panelVisualizador.add(texto);
    }
}
