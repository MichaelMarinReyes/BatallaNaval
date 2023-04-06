package com.frontend.menus;

import com.backend.principal.Archivo;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author michael
 */
public class NuevaPartidaPanel extends javax.swing.JPanel {

    /**
     * Creates new form NuevaPartida
     */
    public NuevaPartidaPanel() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelPrevisualizador = new javax.swing.JPanel();

        jButton1.setText("Cargar Mapa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");

        jButton3.setText("Siguiente");

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrevisualizadorLayout = new javax.swing.GroupLayout(panelPrevisualizador);
        panelPrevisualizador.setLayout(panelPrevisualizadorLayout);
        panelPrevisualizadorLayout.setHorizontalGroup(
            panelPrevisualizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrevisualizadorLayout.setVerticalGroup(
            panelPrevisualizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPrevisualizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrevisualizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        Archivo archivo = new Archivo();
        archivo.leerArchivoTh(chooser.getName());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelPrevisualizador;
    // End of variables declaration//GEN-END:variables

    public void mostrarMensajeDeCargaDeArchivo() {
        String mensajeInformativo = "Debe de subir un archivo con extensión .th, el formato debe ser el siguiente:”\n"
                + "		“~ Indica la posicion de una casilla normal de agua.”\n"
                + "		“B1 Indica la posición del barco de tamaño de una casilla”\n"
                + "		“B2 Indica la posición del barco de tamaño de dos casillas”\n"
                + "		“B3 Indica la posición del barco de tamaño de tres casillas”\n"
                + "		“T Indica la posición de una bomba tipo torpedo”\n"
                + "		“I Indica la posición de una bomba tipo misil”\n"
                + "		“O Indica la posición de una bomba tipo hecatombe”\n"
                + "		“«id» Indica el número o palabra con el que se identificará el mapa, el nombre definido en un mapa no puede repetirse.";

        JTextArea texto = new JTextArea(mensajeInformativo);
        texto.setBounds(50, 50, 300, 200);
        texto.setEditable(false);
    }

    private void mostrarMapas(JTextArea texto) {
        panelPrevisualizador.add(texto);
    }
}
