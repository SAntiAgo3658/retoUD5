package practicasClase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ejercicio4.Persona;

public class ListasYConjuntos {

    public static void main(String[] args) {

        // Vamos a crear una lista de Persona.
        // La rellenamos con 100 Persona.
        // Creamos un set de Persona.
        // Le introducimos los elementos de la lista.

        List<Persona> listaPersonas = new ArrayList<Persona>();
        Persona persona;

        for (int i = 0; i < 100; i++) {
            persona = new Persona("2345", "Teófilo", "Ramírez Rodríguez", 34);
            persona.setEdad(i);
            listaPersonas.add(persona);

        }

        HashSet<Persona> setPersonas = new HashSet<Persona>();

        for (int i = 0; i < listaPersonas.size(); i++) {
            setPersonas.add(listaPersonas.get(i));

        }

        Iterator iteratorSet = setPersonas.iterator();

        while (iteratorSet.hasNext()) {
            System.out.println(((Persona) iteratorSet.next()).getEdad());

        }

        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.print("Lista(" + i + "): " + listaPersonas.get(i).getEdad() + "  ////  ");

        }

    }

}
