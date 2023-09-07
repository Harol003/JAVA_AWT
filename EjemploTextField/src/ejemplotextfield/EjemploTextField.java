/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplotextfield;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploTextField {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional |  Ejemplo de TextField");
        
        // Crear un TextField
        TextField textField = new TextField("Texto por defecto", 20);
        
        // Crear un botón para obtener el texto del TextField
        Button boton = new Button("Ingresa el texto");
        
        // Crear un Label para mostrar el resultado
        Label resultadoLabel = new Label("");
        
        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new FlowLayout());
        
        // Agregar el TextField, el botón y el Label a la ventana
        ventana.add(textField);
        ventana.add(boton);
        ventana.add(resultadoLabel);
        
        // Configurar un ActionListener para el botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del TextField y mostrarlo en el Label
                String texto = textField.getText();
                resultadoLabel.setText("Texto ingresado: " + texto);
            }
        });
        
        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        // Configurar el tamaño de la ventana
        ventana.setSize(300, 100);
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
