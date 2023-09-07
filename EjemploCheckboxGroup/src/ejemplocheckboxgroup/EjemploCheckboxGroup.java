/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocheckboxgroup;

/**
 *
 * @author Harol
 */
import java.awt.*;
import java.awt.event.*;

public class EjemploCheckboxGroup {
    public static void main(String[] args) {
        // Crear una ventana
        Frame ventana = new Frame("| Politecnico internacional | Ejemplo de CheckboxGroup");

        // Crear un grupo de checkboxes exclusivos
        CheckboxGroup grupoGenero = new CheckboxGroup();

        // Crear checkboxes relacionados en el mismo grupo
        Checkbox masculinoCheckbox = new Checkbox("Masculino", grupoGenero, false);
        Checkbox femeninoCheckbox = new Checkbox("Femenino", grupoGenero, false);
        Checkbox otroCheckbox = new Checkbox("Otro", grupoGenero, false);

        // Crear un Label para mostrar la información
        Label informacionLabel = new Label("", Label.CENTER);

        // Configurar el administrador de diseño de la ventana
        ventana.setLayout(new BorderLayout());

        // Agregar los checkboxes y el Label a la ventana
        Panel panelCheckboxes = new Panel();
        panelCheckboxes.setLayout(new FlowLayout());
        panelCheckboxes.add(masculinoCheckbox);
        panelCheckboxes.add(femeninoCheckbox);
        panelCheckboxes.add(otroCheckbox);
        ventana.add(panelCheckboxes, BorderLayout.NORTH);
        ventana.add(informacionLabel, BorderLayout.CENTER);

        // Configurar el cierre de la ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Configurar el ItemListener para los checkboxes
        ItemListener checkBoxListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox checkboxSeleccionado = grupoGenero.getSelectedCheckbox();
                if (checkboxSeleccionado != null) {
                    String generoSeleccionado = checkboxSeleccionado.getLabel();
                    // Actualizar el Label con la información correspondiente al género seleccionado
                    informacionLabel.setText("Género seleccionado: " + generoSeleccionado);
                }
            }
        };

        masculinoCheckbox.addItemListener(checkBoxListener);
        femeninoCheckbox.addItemListener(checkBoxListener);
        otroCheckbox.addItemListener(checkBoxListener);

        // Configurar el tamaño de la ventana
        ventana.setSize(300, 150);

        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - ventana.getWidth()) / 2;
        int y = (pantalla.height - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
