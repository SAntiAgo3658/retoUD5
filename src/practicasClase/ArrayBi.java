package practicasClase;

public class ArrayBi {

    public static void main(String[] args) {

        // construir un array de 10 arrays de 3 Strings.

        String[] jStrings = new String[3];

        String[] español = { "perro", "gato", "casa", "coche", "árbol" };
        String[] ingles = { "dog", "cat", "house", "car", "tree" };
        String[] rumano = { "caine", "pisica", "casa", "masina", "pom" };

        String[][] arrayidiomas = new String[5][3];

        // Cada array de Strig va a ser un lenguaje. (columna), inglés0, español1,
        // 2francés.
        // Cada array va a ser un conjunto de palabras.
        // la composición va a ser la traducción de la misma palabra en su idioma.

        // 10 palabras:
        // Perro, gato, casa, coche, árbol.
        // Dog, cat, house, car, tree.
        // caine, pisica, casa, masina, pom.

        for (int i = 0; i < arrayidiomas.length; i++) {

            for (int j = 0; j < arrayidiomas[0].length; j++) {

                if (j == 0) {
                    System.out.print(arrayidiomas[i][j] = ingles[i] + ", ");

                } else if (j == 1) {
                    System.out.print(arrayidiomas[i][j] = español[i] + ", ");

                } else {
                    System.out.println(arrayidiomas[i][j] = rumano[i]);

                }

            }

        }

    }

}
