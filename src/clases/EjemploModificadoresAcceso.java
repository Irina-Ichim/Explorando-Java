package clases;

// Clase pública con modificador de acceso public
public class EjemploModificadoresAcceso {

    // Atributo público: Puede ser accedido desde cualquier clase
    public int atributoPublico;

    // Atributo privado: Solo puede ser accedido dentro de esta clase
    private String atributoPrivado;

    // Atributo protegido: Puede ser accedido dentro del paquete y por subclases
    protected double atributoProtegido;

    // Constructor público: Puede ser llamado desde cualquier clase
    public EjemploModificadoresAcceso() {
        atributoPublico = 0;
        atributoPrivado = "Inicializado";
        atributoProtegido = 0.0;
    }

    // Método público: Puede ser llamado desde cualquier clase
    public void metodoPublico() {
        System.out.println("Método público");
    }

    // Método privado: Solo puede ser llamado dentro de esta clase
    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    // Método protegido: Puede ser llamado dentro del paquete y por subclases
    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    // Método principal (main) para un ejemplo de uso
    public static void main(String[] args) {
        // Crear un objeto de la clase
        EjemploModificadoresAcceso objeto = new EjemploModificadoresAcceso();

        // Acceder a atributos y métodos desde fuera de la clase
        objeto.atributoPublico = 42;
        System.out.println("Atributo público: " + objeto.atributoPublico);

        objeto.metodoPublico();

        // No podemos acceder a atributos/métodos privados o protegidos directamente desde fuera de la clase
        // objeto.atributoPrivado; // Generaría un error de compilación
        // objeto.metodoPrivado(); // Generaría un error de compilación
        // objeto.atributoProtegido; // Generaría un error de compilación
        // objeto.metodoProtegido(); // Generaría un error de compilación
    }
}
