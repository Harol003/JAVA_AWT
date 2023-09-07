/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploscrollbar;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploScrollbar {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame(" | Politecnico internacional |  Ejemplo de Scrollbar");

        // Crear una barra de desplazamiento vertical
        Scrollbar barraVertical = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 100);

        // Crear un área de texto
        TextArea areaTexto = new TextArea(10, 30);

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new BorderLayout());

        // Agregar la barra de desplazamiento y el área de texto a la ventana
        ventana.add(barraVertical, BorderLayout.EAST);
        ventana.add(areaTexto, BorderLayout.CENTER);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar el listener para la barra de desplazamiento
        barraVertical.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Obtener el valor actual de la barra de desplazamiento
                int valor = barraVertical.getValue();
                // Establecer la posición del área de texto en función del valor de la barra
                areaTexto.setScrollPosition(valor);
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
