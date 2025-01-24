package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainEjercicio1a {
    public static void main(String[] args) {
        List<Profesor> listaProfesores = new ArrayList<>();

        listaProfesores.add(new Profesor("Jose Gonzales", 32, "Ayudante", 2));
        listaProfesores.add(new Profesor("Mario Lopez", 55, "Profesor", 15));
        listaProfesores.add(new Profesor("Ariel Rodriguez", 45, "Profesor", 10));
        listaProfesores.add(new Profesor("Maria Perez", 34, "Profesor", 8));
        listaProfesores.add(new Profesor("Ana Diaz", 25, "Ayudante", 2));

        ListIterator<Profesor> iterador = listaProfesores.listIterator();

        while (iterador.hasNext()) {
            Profesor p = iterador.next();
            System.out.println(p.toString());
            iterador.remove();
        }
    }
}