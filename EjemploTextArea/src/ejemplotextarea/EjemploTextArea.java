/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplotextarea;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploTextArea {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional | Ejemplo de TextArea");

        // Crear un TextArea con un texto predeterminado
        TextArea areaTexto = new TextArea("Este es un ejemplo de TextArea en Java AWT.", 10, 30);

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new BorderLayout());

        // Agregar el TextArea al centro de la ventana
        ventana.add(areaTexto, BorderLayout.CENTER);

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
