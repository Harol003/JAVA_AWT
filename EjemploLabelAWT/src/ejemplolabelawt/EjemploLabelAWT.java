/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolabelawt;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class EjemploLabelAWT {

    public static void main(String[] args) {
        Frame frame = new Frame("| Politecnico internacional | Ejemplo de Label AWT");
        Label etiqueta = new Label("Esta es una etiqueta de texto.");

        frame.add(etiqueta);
        frame.setSize(300, 100);
        frame.setVisible(true);
        
          // Centrar Pantalla
        frame.setLocationRelativeTo(null);
       

        // Agregar un manejador de eventos para cerrar la ventana
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Salir de la aplicación cuando se cierre la ventana
            }
        });
    }
}
