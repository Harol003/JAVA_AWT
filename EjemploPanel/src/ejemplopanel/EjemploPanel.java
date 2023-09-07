/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopanel;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploPanel {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional | Ejemplo de Panel");

        // Crear un Panel 1
        Panel panel1 = new Panel();
        // Configurar un botón en el Panel 1
        Button boton1 = new Button("Botón 1");
        panel1.add(boton1);

        // Crear un Panel 2
        Panel panel2 = new Panel();
        // Configurar una etiqueta en el Panel 2
        Label etiqueta = new Label("Etiqueta en Panel 2");
        panel2.add(etiqueta);

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new GridLayout(2, 1)); // Dos filas, una columna

        // Agregar los paneles a la ventana
        ventana.add(panel1);
        ventana.add(panel2);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar el tamaño de la ventana
        ventana.setSize(300, 200);

        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
