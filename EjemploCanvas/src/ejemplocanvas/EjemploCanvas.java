/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocanvas;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploCanvas extends Canvas {
    public void paint(Graphics g) {
        // Dibujar un rectángulo rojo en el lienzo
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 100);
    }

    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional | Ejemplo de Canvas");

        // Crear un lienzo personalizado
        Canvas lienzo = new EjemploCanvas();

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new BorderLayout());

        // Agregar el lienzo al centro de la ventana
        ventana.add(lienzo, BorderLayout.CENTER);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar el tamaño de la ventana
        ventana.setSize(400, 300);

        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
