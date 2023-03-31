package com.frontend.ventanaprincipal;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JTextArea;
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
    private JPanel menuPrincipal;

    JButton iniciarPartidaBoton = new JButton("Iniciar Partida");
    JButton nuevaPartidaBoton = new JButton("Nueva Partida");
    JButton punteosBoton = new JButton("Punteos");
    JButton tablerosBoton = new JButton("Colección de Tableros");
    JButton salirBoton = new JButton("Salir");
    BorderLayout borderLayaout = new BorderLayout();

    public JFramePrincipal() throws HeadlessException {
        setTitle("Batalla Naval");
        setSize(720, 450);
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
        etiqueta.setSize(200, 40);
        etiqueta.setLocation(260, 80);

        nombreUsuario.setBounds(260, 150, 200, 30);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                nombre = nombreUsuario.getText();
                panelContenedor.setLayout(borderLayaout);
                cargarMenuPrincipal();
            }
        };

        botonRegistrar.setBounds(300, 250, 100, 30);
        botonRegistrar.setBackground(Color.green);

        botonRegistrar.addActionListener(accion);

        panelContenedor.add(nombreUsuario);
        panelContenedor.add(etiqueta);
        panelContenedor.add(botonRegistrar);

    }

    public void pintarPanel(JPanel panel) {
        panelContenedor.removeAll();
        panelContenedor.add(panel);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    private void cargarMenuPrincipal() {
        menuPrincipal = new JPanel();
        menuPrincipal.setSize(700, 350);
        menuPrincipal.setBackground(Color.yellow);
        menuPrincipal.setLayout(null);
        
        iniciarPartidaBoton.setLocation(5, 5);
        nuevaPartidaBoton.setLocation(5, 20);
        punteosBoton.setLocation(5, 35);
        tablerosBoton.setLocation(5, 50);
        salirBoton.setLocation(5, 65);
        
        menuPrincipal.add(iniciarPartidaBoton);
        menuPrincipal.add(nuevaPartidaBoton);
        menuPrincipal.add(punteosBoton);
        menuPrincipal.add(tablerosBoton);
        menuPrincipal.add(salirBoton);
        menuPrincipal.setLayout(borderLayaout);
        pintarPanel(menuPrincipal);
    }

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
    private void confirmacionCerrar() {
        int eleccion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "¿Salir?", 0);
        if (eleccion == 0) {
            System.exit(0);
        } else if (eleccion == 1) {
            JOptionPane.showMessageDialog(this, "Continua jugando");
        }
    }

}
