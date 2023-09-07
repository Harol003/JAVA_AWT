/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploawt;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploAWT {

    public static void main(String[] args) {
        // Crear una instancia de Frame (ventana)
        Frame frame = new Frame("| Politecnico Internacional | Ejemplo AWT");

        // Crear un botón con etiqueta
        Button button = new Button("Haz clic aquí");

        // Crear un manejador de eventos para el botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Este código se ejecuta cuando se hace clic en el botón
                System.out.println("¡Se realizo clic en el boton, Politecnico Internacional!");
            }
        });

        // Agregar el botón al Frame
        frame.add(button);

        // Configurar el cierre de la ventana
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Este código se ejecuta cuando se cierra la ventana
                System.exit(0); // Salir de la aplicación
            }
        });

        // Configurar el tamaño de la ventana
        frame.setSize(300, 200);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
