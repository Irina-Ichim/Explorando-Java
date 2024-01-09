package encapsulamiento;

public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para obtener el valor del atributo privado nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el valor del atributo privado nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el valor del atributo privado edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar el valor del atributo privado edad
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa. Se mantiene el valor actual.");
        }
    }

    // Método público que utiliza los atributos privados
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 25);

        // Acceder a los atributos privados mediante getters
        String nombrePersona = persona.getNombre();
        int edadPersona = persona.getEdad();

        // Imprimir información utilizando un método público
        persona.imprimirInformacion();

        // Modificar los atributos privados mediante setters
        persona.setNombre("Maria");
        persona.setEdad(30);

        // Imprimir la nueva información
        persona.imprimirInformacion();
    }
}
/*El encapsulamiento es uno de los principios fundamentales de la programación orientada a objetos (POO) y se refiere a la ocultación
 de los detalles internos de una clase y la exposición de una interfaz pública.
 En este ejemplo, la clase Persona tiene dos atributos privados (nombre y edad). Se proporcionan métodos públicos 
 (getNombre, setNombre, getEdad, setEdad) para acceder y modificar estos atributos de manera controlada. El método imprimirInformacion 
 es público y muestra la información de la persona, permitiendo el acceso a la información de manera segura.
  */