import java.util.ArrayList;
import java.util.List;
import ejercicio4.Persona;

public class ComparaArrayLista {

    public static void main(String[] args) {

        // Crear un array de 10000 elementos de tipo Persona.
        // Crear una lista de 10000 elementos de tipo Persona.
        // Todas las instancias a introducir son iguales.
        // Comparar el tiempo de inserción en cada caso.

        Persona persona = new Persona("12345", "Fernández Fernández", "Manuel", 34);

        Persona[] arrayPersonas = new Persona[10000];

        List<Persona> personas = new ArrayList<Persona>();

        long tiempo;
        long segundo;
        long primero;

        primero = System.nanoTime();

        for (int i = 0; i < arrayPersonas.length; i++) {
            arrayPersonas[i] = persona;

        }

        segundo = System.nanoTime();

        tiempo = segundo - primero;

        System.out.println("Array meter: " + tiempo);

        primero = System.nanoTime();

        for (int i = 0; i < 10000; i++) {

            personas.add(persona);

        }

        segundo = System.nanoTime();

        tiempo = segundo - primero;

        System.out.println("Lista meter: " + tiempo);

        primero = System.nanoTime();

        for (int i = 0; i < arrayPersonas.length; i++) {
            persona = arrayPersonas[i];

        }

        segundo = System.nanoTime();

        tiempo = segundo - primero;

        System.out.println("Array sacar: " + tiempo);

        primero = System.nanoTime();

        for (int i = 0; i < 10000; i++) {

            persona = personas.get(i);

        }

        segundo = System.nanoTime();

        tiempo = segundo - primero;

        System.out.println("Lista sacar: " + tiempo);


    }

    

}
