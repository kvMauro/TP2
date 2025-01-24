package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {
    private String nombre;

    public Polideportivo() {
        super();
    }

    public Polideportivo(String nombre, double superficie) {
        super(superficie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getTipoDeInstalacion() {
        return 2;
    }

    @Override
    public String toString() {
        return "Polideportivo = " + super.toString() + "\nNombre: " + nombre
                + "\nTipo de Instalacion: " + getTipoDeInstalacion();
    }
}
