package com.frontend.ventanaymenus;

import com.backend.principal.Usuario;

/**
 *
 * @author michael
 */
public class PuntajesPanel extends javax.swing.JPanel {

    private String nombre;
    private int puntos;
    /**
     * Creates new form PuntajesPanel
     */
    public PuntajesPanel() {
        initComponents();
        setVisible(true);
        mostrarNombrePuntos();
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

        panelDatosJuego = new javax.swing.JPanel();
        panelDatosUsuario = new javax.swing.JPanel();
        nombreTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        puntosTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelDatosJuego.setBackground(new java.awt.Color(102, 255, 102));
        panelDatosJuego.setLayout(new java.awt.BorderLayout());
        add(panelDatosJuego, java.awt.BorderLayout.CENTER);

        panelDatosUsuario.setBackground(new java.awt.Color(255, 255, 102));
        panelDatosUsuario.setLayout(new java.awt.GridBagLayout());

        nombreTextField.setEditable(false);
        nombreTextField.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 0, 0);
        panelDatosUsuario.add(nombreTextField, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelDatosUsuario.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puntaje:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        panelDatosUsuario.add(jLabel2, gridBagConstraints);

        puntosTextField.setEditable(false);
        puntosTextField.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        panelDatosUsuario.add(puntosTextField, gridBagConstraints);

        jButton2.setText("Descargar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        panelDatosUsuario.add(jButton2, gridBagConstraints);

        add(panelDatosUsuario, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPanel panelDatosJuego;
    private javax.swing.JPanel panelDatosUsuario;
    private javax.swing.JTextField puntosTextField;
    // End of variables declaration//GEN-END:variables

    public void copiarDatos(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    private void mostrarNombrePuntos() {
        nombreTextField.setText(nombre);
        puntosTextField.setText(Integer.toString(puntos));
    }
    
}