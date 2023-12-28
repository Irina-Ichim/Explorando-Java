package operadores.sentencias;

import java.util.Scanner;

public class SentenciasCondicionales {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número de día
        System.out.print("Ingrese un número de día de la semana (1-7): ");
        int numeroDia = scanner.nextInt();

        // Evaluar el día de la semana usando if-else
        System.out.print("Día de la semana usando if-else: ");
        if (numeroDia >= 1 && numeroDia <= 7) {
            if (numeroDia == 1) {
                System.out.println("Lunes");
            } else if (numeroDia == 2) {
                System.out.println("Martes");
            } else if (numeroDia == 3) {
                System.out.println("Miércoles");
            } else if (numeroDia == 4) {
                System.out.println("Jueves");
            } else if (numeroDia == 5) {
                System.out.println("Viernes");
            } else if (numeroDia == 6) {
                System.out.println("Sábado");
            } else {
                System.out.println("Domingo");
            }
        } else {
            System.out.println("Número de día no válido.");
        }

        // Evaluar el día de la semana usando switch
        System.out.print("Día de la semana usando switch: ");
        String nombreDia;
        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día no válido";
        }
        System.out.println(nombreDia);

        // Cerrar el scanner para evitar posibles fugas de recursos
        scanner.close();
    }
}

