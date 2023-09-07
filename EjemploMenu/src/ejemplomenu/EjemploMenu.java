/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomenu;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploMenu {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame(" | Politecnico internacional |  Ejemplo de Menu");

        // Crear una barra de menús
        MenuBar barraMenus = new MenuBar();

        // Crear un menú "Archivo"
        Menu menuArchivo = new Menu("Archivo");

        // Crear un elemento de menú "Abrir"
        MenuItem abrirItem = new MenuItem("Abrir");

        // Crear un elemento de menú "Salir"
        MenuItem salirItem = new MenuItem("Salir");

        // Agregar elementos de menú al menú "Archivo"
        menuArchivo.add(abrirItem);
        menuArchivo.addSeparator(); // Separador entre elementos de menú
        menuArchivo.add(salirItem);

        // Agregar el menú "Archivo" a la barra de menús
        barraMenus.add(menuArchivo);

        // Configurar la barra de menús en la ventana
        ventana.setMenuBar(barraMenus);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar ActionListener para el elemento "Salir"
        salirItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Salir de la aplicación al hacer clic en "Salir"
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
