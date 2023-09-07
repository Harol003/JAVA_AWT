/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplochoice;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploChoice {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional | Ejemplo de Choice");

        // Crear un componente Choice
        Choice opcionesChoice = new Choice();

        // Agregar opciones al Choice
        opcionesChoice.add("Opción 1");
        opcionesChoice.add("Opción 2");
        opcionesChoice.add("Opción 3");
        opcionesChoice.add("Opción 4");

        // Crear un Label para mostrar la selección
        Label resultadoLabel = new Label("Selección: ");

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new FlowLayout());

        // Agregar el Choice y el Label a la ventana
        ventana.add(opcionesChoice);
        ventana.add(resultadoLabel);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar ActionListener para el Choice
        opcionesChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // Obtener la opción seleccionada y mostrarla en el Label
                String seleccion = opcionesChoice.getSelectedItem();
                resultadoLabel.setText("Selección: " + seleccion);
            }
        });

        // Configurar el tamaño de la ventana
        ventana.setSize(300, 100);

        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
