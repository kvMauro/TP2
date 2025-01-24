package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1b {
    public static void main(String[] args) {
        TreeSet<Profesor> listaProfesores = new TreeSet<>();
        listaProfesores.add(new Profesor("Jose Gonzales", 32, "Ayudante", 2));
        listaProfesores.add(new Profesor("Mario Lopez", 55, "Profesor", 15));
        listaProfesores.add(new Profesor("Ariel Rodriguez", 45, "Profesor", 10));
        listaProfesores.add(new Profesor("Maria Perez", 34, "Profesor", 8));
        listaProfesores.add(new Profesor("Ana Diaz", 25, "Ayudante", 2));

        Iterator<Profesor> iterador = listaProfesores.iterator();

        while (iterador.hasNext()) {
            Profesor p = (Profesor) iterador.next();
            System.out.println(p.toString());
            iterador.remove();
        }

        Profesor compararProf = new Profesor("Ana Diaz", 25, "Ayudante", 3);
        Profesor compararProf2 = new Profesor("Ana Diaz", 25, "Ayudante", 3);

        if (compararProf.equals(compararProf2)) {
            System.out.println("Es el mismo profesor");
        }
    }
}
