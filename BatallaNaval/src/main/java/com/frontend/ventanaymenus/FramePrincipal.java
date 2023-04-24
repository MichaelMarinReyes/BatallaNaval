package com.frontend.ventanaymenus;

import com.backend.principal.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author michael
 */
public class FramePrincipal extends javax.swing.JFrame {

    private JLabel etiqueta;
    private JButton botonRegistrar;
    private JTextField nombreUsuario;
    private Usuario jugador;
    private IniciarPartidaPanel iniciarPanel;
    private NuevaPartidaPanel nuevaPanel;
    private PuntajesPanel puntajesPanel = new PuntajesPanel();
    private ColeccionTablerosPanel tablerosPanel;
    private JTextArea texto;

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        setTitle("Batalla Naval");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmacionCerrar();
            }

        });
        registrarJugador();
        panelBotones.setBackground(Color.DARK_GRAY);
        desabilitarBotones();
        regresarBoton.setVisible(false);
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

        panelContenedor = new FondoPanel();
        panelBotones = new javax.swing.JPanel();
        iniciarBoton = new javax.swing.JButton();
        nuevaBoton = new javax.swing.JButton();
        puntajesBoton = new javax.swing.JButton();
        tablerosboton = new javax.swing.JButton();
        salirBoton = new javax.swing.JButton();
        regresarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        panelContenedor.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        getContentPane().add(panelContenedor, java.awt.BorderLayout.CENTER);

        panelBotones.setLayout(new java.awt.GridBagLayout());

        iniciarBoton.setBackground(new java.awt.Color(86, 111, 156));
        iniciarBoton.setForeground(java.awt.Color.white);
        iniciarBoton.setText("IniciarPartida");
        iniciarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBotonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 10, 0);
        panelBotones.add(iniciarBoton, gridBagConstraints);

        nuevaBoton.setBackground(new java.awt.Color(86, 111, 156));
        nuevaBoton.setForeground(java.awt.Color.white);
        nuevaBoton.setText("Nueva Partida");
        nuevaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaBotonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 10, 0);
        panelBotones.add(nuevaBoton, gridBagConstraints);

        puntajesBoton.setBackground(new java.awt.Color(86, 111, 156));
        puntajesBoton.setForeground(java.awt.Color.white);
        puntajesBoton.setText("Puntajes");
        puntajesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntajesBotonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 10, 0);
        panelBotones.add(puntajesBoton, gridBagConstraints);

        tablerosboton.setBackground(new java.awt.Color(86, 111, 156));
        tablerosboton.setForeground(java.awt.Color.white);
        tablerosboton.setText("Colección de Tableros");
        tablerosboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablerosbotonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 10, 0);
        panelBotones.add(tablerosboton, gridBagConstraints);

        salirBoton.setBackground(new java.awt.Color(86, 111, 156));
        salirBoton.setForeground(java.awt.Color.white);
        salirBoton.setText("Salir");
        salirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 10, 0);
        panelBotones.add(salirBoton, gridBagConstraints);

        regresarBoton.setBackground(new java.awt.Color(86, 111, 156));
        regresarBoton.setForeground(java.awt.Color.white);
        regresarBoton.setText("Regresar");
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 10, 92);
        panelBotones.add(regresarBoton, gridBagConstraints);

        getContentPane().add(panelBotones, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBotonActionPerformed
        iniciarPanel = new IniciarPartidaPanel(jugador);
        pintarPanel(iniciarPanel);
        iniciarBoton.setEnabled(false);
        nuevaBoton.setVisible(false);
        puntajesBoton.setVisible(false);
        tablerosboton.setVisible(false);
        salirBoton.setVisible(false);
        regresarBoton.setVisible(true);
        regresarBoton.setEnabled(true);
    }//GEN-LAST:event_iniciarBotonActionPerformed

    private void nuevaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaBotonActionPerformed
        nuevaPanel = new NuevaPartidaPanel();
        pintarPanel(nuevaPanel);
        JOptionPane.showMessageDialog(null, mostrarMensajeDeCargaDeArchivo());
        iniciarBoton.setVisible(true);
        nuevaBoton.setEnabled(false);
        puntajesBoton.setVisible(false);
        tablerosboton.setVisible(false);
        salirBoton.setVisible(false);
        regresarBoton.setVisible(true);
        regresarBoton.setEnabled(true);
        iniciarBoton.setEnabled(true);
    }//GEN-LAST:event_nuevaBotonActionPerformed

    private void puntajesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntajesBotonActionPerformed
        pintarPanel(puntajesPanel);
        iniciarBoton.setVisible(false);
        nuevaBoton.setVisible(false);
        puntajesBoton.setEnabled(false);
        tablerosboton.setVisible(false);
        salirBoton.setVisible(false);
        regresarBoton.setVisible(true);
        regresarBoton.setEnabled(true);
    }//GEN-LAST:event_puntajesBotonActionPerformed

    private void tablerosbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablerosbotonActionPerformed
        tablerosPanel = new ColeccionTablerosPanel(jugador);
        pintarPanel(tablerosPanel);
        JOptionPane.showMessageDialog(null, mostrarMensajeDeCargaDeArchivo());
        iniciarBoton.setVisible(false);
        nuevaBoton.setVisible(false);
        puntajesBoton.setVisible(false);
        tablerosboton.setEnabled(false);
        salirBoton.setVisible(false);
        regresarBoton.setVisible(true);
        regresarBoton.setEnabled(true);
    }//GEN-LAST:event_tablerosbotonActionPerformed

    private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonActionPerformed
        confirmacionCerrar();
    }//GEN-LAST:event_salirBotonActionPerformed

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        panelContenedor.setLayout(new BorderLayout());
        panelContenedor.removeAll();
        panelContenedor.repaint();
        panelContenedor.revalidate();

        iniciarBoton.setVisible(true);
        nuevaBoton.setVisible(true);
        puntajesBoton.setVisible(true);
        tablerosboton.setVisible(true);
        salirBoton.setVisible(true);
        regresarBoton.setVisible(false);

        iniciarBoton.setEnabled(true);
        nuevaBoton.setEnabled(true);
        puntajesBoton.setEnabled(true);
        tablerosboton.setEnabled(true);
        salirBoton.setEnabled(true);
        regresarBoton.setEnabled(false);
    }//GEN-LAST:event_regresarBotonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarBoton;
    private javax.swing.JButton nuevaBoton;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JButton puntajesBoton;
    private javax.swing.JButton regresarBoton;
    private javax.swing.JButton salirBoton;
    private javax.swing.JButton tablerosboton;
    // End of variables declaration//GEN-END:variables

    public void registrarJugador() {
        this.getContentPane().add(panelContenedor);
        etiqueta = new JLabel("INGRESA TU NOMBRE O NICK", SwingConstants.CENTER);
        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setMnemonic(KeyEvent.VK_ENTER);
        nombreUsuario = new JTextField();

        etiqueta.setForeground(Color.CYAN);
        etiqueta.setFont(new Font("Liberation Sans", Font.BOLD, 16));
        etiqueta.setBounds(panelContenedor.getWidth() / 2 - 100, panelContenedor.getHeight() / 2 - 120, 250, 40);

        nombreUsuario.setBounds(panelContenedor.getWidth() / 2 - 80, panelContenedor.getHeight() / 2 - 70, 200, 30);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (nombreUsuario.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingresa un usuario");
                } else if (!nombreUsuario.getText().equals("")) {
                    panelContenedor.setLayout(new BorderLayout());
                    jugador = new Usuario(nombreUsuario.getText(), 0);
                    puntajesPanel.copiarDatos(jugador.getNombre(), jugador.getPuntos());
                    JOptionPane.showMessageDialog(null, "Bienvenido " + nombreUsuario.getText() + " dirigete a Nueva Partida para comenzar a jugar");
                    habilitarDespuesDeRegistro();
                }
            }
        };

        botonRegistrar.setBounds(panelContenedor.getWidth() / 2 - 20, panelContenedor.getHeight() / 2, 100, 30);
        botonRegistrar.setBackground(Color.green);
        botonRegistrar.addActionListener(accion);

        panelContenedor.add(nombreUsuario);
        panelContenedor.add(etiqueta);
        panelContenedor.add(botonRegistrar);

    }

    private void pintarPanel(JPanel panel) {
        panelContenedor.setLayout(new BorderLayout());
        panelContenedor.removeAll();
        panelContenedor.add(panel);
        panelContenedor.repaint();
        panelContenedor.revalidate();
    }

    public void confirmacionCerrar() {
        int eleccion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "¿Salir?", 0);
        if (eleccion == 0) {
            System.exit(0);
        } else if (eleccion == 1) {
            JOptionPane.showMessageDialog(this, "Continua jugando");
        }
    }

    private void habilitarDespuesDeRegistro() {
        panelContenedor.setLayout(new BorderLayout());
        panelContenedor.removeAll();
        panelContenedor.repaint();
        panelContenedor.revalidate();

        iniciarBoton.setVisible(true);
        nuevaBoton.setVisible(true);
        puntajesBoton.setVisible(true);
        tablerosboton.setVisible(true);
        salirBoton.setVisible(true);
        regresarBoton.setVisible(false);

        iniciarBoton.setEnabled(false);
        nuevaBoton.setEnabled(true);
        puntajesBoton.setEnabled(true);
        tablerosboton.setEnabled(true);
        salirBoton.setEnabled(true);
        regresarBoton.setEnabled(false);
    }

    private void desabilitarBotones() {
        iniciarBoton.setVisible(false);
        nuevaBoton.setVisible(false);
        puntajesBoton.setVisible(false);
        tablerosboton.setVisible(false);
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JTextArea mostrarMensajeDeCargaDeArchivo() {
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
        texto.setOpaque(true);
        texto.setBackground(Color.WHITE);
        texto.setEditable(false);
        return texto;
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            try {

                imagen = new ImageIcon(getClass().getResource("/com/imagenes/imagenBatallaNaval.png")).getImage();
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

                setOpaque(false);
                super.paint(g);

            } catch (NullPointerException e) {
                System.out.println("");
            }
        }
    }
}
