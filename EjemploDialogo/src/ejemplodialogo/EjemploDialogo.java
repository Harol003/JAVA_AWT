/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodialogo;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploDialogo {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional | Ejemplo de Dialogo");

        // Crear un botón en la ventana
        Button botonAbrirDialogo = new Button("Abrir Diálogo");
        ventana.add(botonAbrirDialogo, BorderLayout.CENTER);

        // Configurar el cierre de la ventana principal
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar el ActionListener para el botón
        botonAbrirDialogo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear un diálogo modal
                Dialog dialogo = new Dialog(ventana, "Ingrese su nombre", true);

                // Configurar un layout para el diálogo
                dialogo.setLayout(new FlowLayout());

                // Crear un campo de texto en el diálogo
                TextField campoTexto = new TextField(20);
                dialogo.add(campoTexto);

                // Crear un botón "Aceptar" en el diálogo
                Button botonAceptar = new Button("Aceptar");
                dialogo.add(botonAceptar);

                // Configurar el cierre del diálogo
                dialogo.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        dialogo.dispose(); // Cerrar el diálogo al hacer clic en el botón de cierre
                    }
                });

                // Configurar ActionListener para el botón "Aceptar"
                botonAceptar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String nombre = campoTexto.getText();
                        ventana.setTitle("Hola, " + nombre); // Mostrar el nombre en la ventana principal
                        dialogo.dispose(); // Cerrar el diálogo
                    }
                });

                // Configurar el tamaño y mostrar el diálogo
                dialogo.setSize(300, 100);
                dialogo.setLocationRelativeTo(null); // Centrar el diálogo
                dialogo.setVisible(true);
            }
        });

        // Configurar el tamaño de la ventana principal
        ventana.setSize(300, 100);

        // Centrar la ventana principal en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Hacer visible la ventana principal
        ventana.setVisible(true);
    }
}
