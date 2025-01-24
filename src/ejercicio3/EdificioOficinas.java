package ejercicio3;

public class EdificioOficinas extends Edificio {
    private int numeroOficinas;

    public EdificioOficinas() {
        super();
    }

    public EdificioOficinas(double superficie, int numeroOficinas) {
        super(superficie);
        this.numeroOficinas = numeroOficinas;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public String toString() {
        return "Edificio de Oficinas = " + super.toString() + "\nCantidad de oficinas en el edificio: "
                + numeroOficinas;
    }
}
