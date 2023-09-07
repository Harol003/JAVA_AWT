/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploeventos;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploEventos {

    public static void main(String[] args) {
        // Crear una instancia de JFrame (ventana)
        JFrame ventana = new JFrame("| Politecnico Internacional | Ejemplo de Manejo de Eventos |");

        // Crear un botón con etiqueta
        JButton boton = new JButton("Haz clic aquí");

        // Crear un manejador de eventos para el botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Este código se ejecuta cuando se hace clic en el botón
                JOptionPane.showMessageDialog(null, "¡Se realizo clic en el boton, Politecnico Internacional!");
            }
        });

        // Configurar el cierre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agregar el botón a la ventana
        ventana.add(boton);

        // Configurar el tamaño de la ventana
        ventana.setSize(300, 200);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
