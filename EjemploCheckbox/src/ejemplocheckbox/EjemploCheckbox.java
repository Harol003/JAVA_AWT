/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocheckbox;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploCheckbox {
    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("| Politecnico internacional | Ejemplo de Checkbox");

        // Crear Checkbox para diferentes opciones
        JCheckBox checkBox1 = new JCheckBox("Opción 1");
        JCheckBox checkBox2 = new JCheckBox("Opción 2");
        JCheckBox checkBox3 = new JCheckBox("Opción 3");

        // Crear un Panel para mostrar el texto de la "Opción 2"
        JPanel panelTexto = new JPanel();
        JTextArea textoArea = new JTextArea("Este es un texto para la Opción 2.");
        panelTexto.add(textoArea);

        // Configurar el cierre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar el tamaño de la ventana
        ventana.setSize(400, 300);

        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Agregar ActionListener para los checkboxes
        checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    // Aquí puedes agregar el código para mostrar la tabla
                }
            }
        });

        checkBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox2.isSelected()) {
                    // Mostrar el panel de texto para la "Opción 2"
                    ventana.getContentPane().removeAll();
                    ventana.getContentPane().add(checkBox1, BorderLayout.NORTH);
                    ventana.getContentPane().add(checkBox2, BorderLayout.CENTER);
                    ventana.getContentPane().add(checkBox3, BorderLayout.SOUTH);
                    ventana.getContentPane().add(panelTexto, BorderLayout.EAST);
                    ventana.revalidate();
                    ventana.repaint();
                }
            }
        });

        checkBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox3.isSelected()) {
                    // Aquí puedes agregar el código para mostrar el botón de créditos
                }
            }
        });

        // Agregar los checkboxes a la ventana
        ventana.add(checkBox1, BorderLayout.NORTH);
        ventana.add(checkBox2, BorderLayout.CENTER);
        ventana.add(checkBox3, BorderLayout.SOUTH);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
