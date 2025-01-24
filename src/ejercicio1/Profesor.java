package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {
    private String cargo;
    private int antiguedadDocente;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
        super(nombre, edad);
        this.cargo = cargo;
        this.antiguedadDocente = antiguedadDocente;
    }

    public String getCargo() {
        return cargo;
    }

    public int getAntiguedadDocente() {
        return antiguedadDocente;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setAntiguedadDocente(int antiguedadDocente) {
        this.antiguedadDocente = antiguedadDocente;
    }

    @Override
    public String toString() {
        return getId() + " " + getNombre() + " " + getEdad() + " " + this.cargo + " " + this.antiguedadDocente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + antiguedadDocente;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Profesor other = (Profesor) obj;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (antiguedadDocente != other.antiguedadDocente)
            return false;
        return true;
    }

    @Override
    public int compareTo(Profesor o) {
        // Ordena de menor a mayor la antiguedad docente
        if (o.antiguedadDocente == this.antiguedadDocente) {
            return 0;
        }

        if (o.antiguedadDocente < this.antiguedadDocente) {
            return 1;
        }
        return -1;
    }

}
