package com.frontend.ventanaprincipal;

import com.backend.menus.NuevaPartida;
import com.backend.menus.Puntaje;
import com.frontend.menus.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author michael
 */
public class JFramePrincipal extends JFrame {

    private JPanel panelContenedor;
    private JLabel etiqueta;
    private JButton botonRegistrar;
    private JTextField nombreUsuario;
    private String nombre;

    IniciarPartidaPanel iniciarPartida = new IniciarPartidaPanel();
    NuevaPartidaPanel nuevaPartida = new NuevaPartidaPanel();
    PuntajesPanel puntajes = new PuntajesPanel();
    ColeccionTablerosPanel tableros = new ColeccionTablerosPanel();
    BorderLayout borderLayout = new BorderLayout();
    GridLayout gridLayout = new GridLayout();

    public JFramePrincipal() throws HeadlessException {
        setTitle("Batalla Naval");
        setSize(1000, 700);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmacionCerrar();
            }

        });
        iniciarComponentes();
    }

    public String getNombre() {
        return nombre;
    }

    private void iniciarComponentes() {
        colocarPanelPrincipal();
        registrarJugador();
    }

    private void colocarPanelPrincipal() {
        panelContenedor = new JPanel();
        panelContenedor.setBackground(Color.blue);
        panelContenedor.setLayout(null);
    }

    public void registrarJugador() {
        this.getContentPane().add(panelContenedor);
        etiqueta = new JLabel("Ingresa tu Nombre o Nick:", SwingConstants.CENTER);
        botonRegistrar = new JButton("Registrar");
        nombreUsuario = new JTextField();

        etiqueta.setForeground(Color.white);
        etiqueta.setBounds(400, 120, 200, 40);

        nombreUsuario.setBounds(400, 190, 200, 30);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                nombre = nombreUsuario.getText();
                panelContenedor.setLayout(borderLayout);
                MenuPanel panel = new MenuPanel();
                pintarPanel(panel);
            }
        };

        botonRegistrar.setBounds(450, 290, 100, 30);
        botonRegistrar.setBackground(Color.green);

        botonRegistrar.addActionListener(accion);

        panelContenedor.add(nombreUsuario);
        panelContenedor.add(etiqueta);
        panelContenedor.add(botonRegistrar);

    }
    
    private void pintarPanel(JPanel panel) {
        panelContenedor.setLayout(borderLayout);
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

}
