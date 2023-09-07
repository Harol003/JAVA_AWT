/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolist;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploList {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame(" | Politecnico internacional | Ejemplo de List");

        // Crear un componente List
        List opcionesList = new List(4, true); // El segundo parámetro permite selección múltiple

        // Agregar elementos a la lista
        opcionesList.add("Opción 1");
        opcionesList.add("Opción 2");
        opcionesList.add("Opción 3");
        opcionesList.add("Opción 4");
        opcionesList.add("Opción 5");

        // Crear un botón para mostrar selecciones
        Button mostrarSeleccionButton = new Button("Mostrar Selección");

        // Crear un Label para mostrar la selección
        Label resultadoLabel = new Label("Selección: ");

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new FlowLayout());

        // Agregar la lista, el botón y el Label a la ventana
        ventana.add(opcionesList);
        ventana.add(mostrarSeleccionButton);
        ventana.add(resultadoLabel);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar ActionListener para el botón
        mostrarSeleccionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener las selecciones y mostrarlas en el Label
                String[] selecciones = opcionesList.getSelectedItems();
                resultadoLabel.setText("Selección: " + String.join(", ", selecciones));
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
