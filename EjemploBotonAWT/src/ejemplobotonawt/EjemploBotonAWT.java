/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobotonawt;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploBotonAWT {

    public static void main(String[] args) {
        Frame frame = new Frame("| Politecnico Internacional | Ejemplo de Botón AWT");
        Button boton = new Button("Haz clic aquí");

        // Agregar un manejador de eventos al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Se realizo clic en el boton, Politecnico Internacional! ");
            }
        });

        frame.add(boton);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
