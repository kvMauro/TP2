package ejercicio2;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
    private double temperaturaCongelacion;

    public ProductoCongelado() {
        super();
    }

    public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public String toString() {
        return "Producto Congelado = " + super.toString() + ", Temperatura de congelacion recomendada: "
                + temperaturaCongelacion + "°C";
    }

}
