package ejercicio2;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    private String codigoSupervision;

    public ProductoRefrigerado() {
        super();
    }

    public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, String codigoSupervision) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
    }

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    @Override
    public String toString() {
        return "Producto Refrigerado = " + super.toString() + ", Codigo organismo de supervision alimentaria: "
                + codigoSupervision;
    }

}
