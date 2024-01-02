package clases;

import javax.swing.JOptionPane;

public class ConvertidorMayusculasMinusculasGui {

    public static void main(String[] args) {
        // Pedir una frase
        String frase = JOptionPane.showInputDialog("Introduce una frase:");

        // Pedir al usuario que seleccione la opción de conversión
        String[] opciones = {"Mayúsculas", "Minúsculas"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "¿Quieres convertir a mayúsculas o minúsculas?",
                "Opción de Conversión",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        // Realizar la conversión según la opción seleccionada
        String resultado = "";
        if (seleccion == 0) {
            resultado = frase.toUpperCase();
        } else if (seleccion == 1) {
            resultado = frase.toLowerCase();
        } else {
            // El usuario cerró el cuadro de diálogo sin seleccionar una opción
            System.out.println("Operación cancelada.");
            return;
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}

/**javax.swing.JOptionPane es una clase en Java que pertenece al paquete javax.swing. Esta clase proporciona métodos para crear y 
 * mostrar cuadros de diálogo (ventanas emergentes) en aplicaciones basadas en interfaces gráficas de usuario (GUI). Los cuadros de 
 * diálogo de JOptionPane se utilizan para interactuar con el usuario y obtener entrada o mostrar información.JOptionPane ofrece diversos
 * métodos estáticos para crear diferentes tipos de cuadros de diálogo, como cuadros de entrada (showInputDialog()), cuadros de mensaje
 *  (showMessageDialog()), cuadros de confirmación (showConfirmDialog()), entre otros.
 *  */