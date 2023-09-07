/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopopupmenu;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploPopupMenu {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame(" | Politecnico internacional |  Ejemplo de PopupMenu");

        // Crear un PopupMenu
        PopupMenu popupMenu = new PopupMenu("Menú Emergente");

        // Crear elementos de menú para el PopupMenu
        MenuItem opcion1 = new MenuItem("Opción 1");
        MenuItem opcion2 = new MenuItem("Opción 2");

        // Agregar elementos de menú al PopupMenu
        popupMenu.add(opcion1);
        popupMenu.add(opcion2);

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new BorderLayout());

        // Agregar el PopupMenu a la ventana
        ventana.add(popupMenu);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar ActionListener para las opciones del PopupMenu
        opcion1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Opción 1 seleccionada");
            }
        });

        opcion2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Opción 2 seleccionada");
            }
        });

        // Configurar el tamaño de la ventana
        ventana.setSize(300, 200);

        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Configurar el listener para mostrar el PopupMenu en clic derecho
        ventana.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // Clic derecho
                    popupMenu.show(ventana, e.getX(), e.getY());
                }
            }
        });

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
