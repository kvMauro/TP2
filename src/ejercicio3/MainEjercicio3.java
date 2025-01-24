package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio3 {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        edificios.add(new Polideportivo("Polideportivo Mariano Moreno", 15000));
        edificios.add(new Polideportivo("Polideportivo Islas Malvinas", 10000));
        edificios.add(new Polideportivo("Polideportivo General Belgrano", 13200));
        edificios.add(new EdificioOficinas(10000, 50));
        edificios.add(new EdificioOficinas(3500, 30));

        ListIterator<Edificio> iterador = edificios.listIterator();
        while (iterador.hasNext()) {
            Edificio edificio = iterador.next();
            System.out.println(edificio.toString());
        }
    }
}
