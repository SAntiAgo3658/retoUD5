package practicasClase;

import java.util.ArrayList;
import java.util.List;

public class ListaDeArrays {

    public static void main(String[] args) {

        // Una lista de palabras escritas en tres idiomas: inglés, español, rumano.
        // La lista no tiene tamaño fijo.
        // Los idiomas si tienen tamaño fijo (usar array)
        // Si de una palabra no tenemos la traducción a algún idioma, se pone a null y
        // se añadirá más adelante.

        String[] ingles = { "house", "car", "bottle", "exercise", "ham", "dog" };
        String[] español = { "casa", "coche", "botella", "ejercicio", "jamón", "perro" };
        String[] rumano = { "casa", "masina", null, null, null, "caine" };

        List<String> listaIdiomas = new ArrayList<String>();

        for (int i = 0; i < listaIdiomas.size(); i++) {

            for (int j = 0; j < rumano.length; j++) {

                if (j == 0) {
                    listaIdiomas.add(ingles[i]);

                }

            }

        }

    }

}
