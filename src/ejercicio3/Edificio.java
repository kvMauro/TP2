package ejercicio3;

public abstract class Edificio {
    private double superficieEdificio;

    public Edificio() {
    }

    public Edificio(double superficieEdificio) {
        this.superficieEdificio = superficieEdificio;
    }

    public double getSuperficieEdificio() {
        return superficieEdificio;
    }

    public void setSuperficieEdificio(double superficieEdificio) {
        this.superficieEdificio = superficieEdificio;
    }

    @Override
    public String toString() {
        return String.format("Superficie del edificio: %.2f m2", superficieEdificio);
    }
}
