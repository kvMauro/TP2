package ejercicio1;

public class Empleado {
    private final int id;
    private String nombre;
    private int edad;
    private static int contadorEmpleado = 999;

    public Empleado() {
        this.id = ++Empleado.contadorEmpleado;
        this.nombre = "sin nombre";
        this.edad = 99;
    }

    public Empleado(String nombre, int edad) {
        this.id = ++Empleado.contadorEmpleado;
        this.nombre = nombre;
        this.edad = edad;
    }

    public static int devuelveProximoID() {
        return ++Empleado.contadorEmpleado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
}
