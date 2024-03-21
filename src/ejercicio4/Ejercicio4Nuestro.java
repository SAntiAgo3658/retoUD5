package ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Crear un array de 1000 Persona.
// Introducir la misma persona pero con edad consecutivo.
// Crear un directorio "personas".
// Crear archivo en directorio "personas" llamado "personasInicial.dat".
// Almacenar en dicho archivo todas las personas.
// Crear dos archivos "personasPar.dar" y "personasImpar.dat".
// Leer personas de "personasInicial.dat" y almacenar dependiendo de la edad en uno u otro.
// El que corresponda.

public class Ejercicio4Nuestro {

    public static void main(String[] args) throws IOException {

        Persona[] arrayPersonas = new Persona[1000];
        Persona persona = null;

        for (int i = 0; i < arrayPersonas.length; i++) {
            persona = new Persona("65757", "Hernández Hernández", "Joel", 0);
            persona.setEdad(i);
            arrayPersonas[i] = persona;

        }

        File directorio = new File(
                "C://Users//SantiagoElíasDavidGo//Desktop//RETOS//retoUD5//src//ejercicio4//personas");
        directorio.mkdir();

        File fichero = new File(
                "C://Users//SantiagoElíasDavidGo//Desktop//RETOS//retoUD5//src//ejercicio4//personas//personasInicial.dat");

        ObjectOutputStream escritor = null;

        try {
            escritor = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)));
            for (int i = 0; i < arrayPersonas.length; i++) {
                escritor.writeObject(arrayPersonas[i]);

            }

        } catch (FileNotFoundException e) {
            e.getMessage();

        } finally {
            if (escritor != null) {
                escritor.close();

            }

        }

        File ficheroPares = new File(
                "C://Users//SantiagoElíasDavidGo//Desktop//RETOS//retoUD5//src//ejercicio4//personas//personasPar.dat");
        File ficheroImpares = new File(
                "C://Users//SantiagoElíasDavidGo//Desktop//RETOS//retoUD5//src//ejercicio4//personas//personasImpar.dat");

        ObjectInputStream lector = null;
        ObjectOutputStream escritorPares = null;
        ObjectOutputStream escritorImpares = null;

        Persona personaMeter = null;

        try {
            lector = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero)));
            escritorPares = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ficheroPares)));
            escritorImpares = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ficheroImpares)));

            for (int i = 0; i < arrayPersonas.length; i++) {
                personaMeter = (Persona) lector.readObject();

                if (i % 2 == 0) {
                    escritorPares.writeObject(personaMeter);

                } else {
                    escritorImpares.writeObject(personaMeter);

                }

            }

        } catch (FileNotFoundException e) {
            e.getMessage();

        } catch (ClassNotFoundException e) {
            e.getMessage();

        } finally {
            if (lector != null) {
                lector.close();

            }

            if (escritorImpares != null) {
                escritorImpares.close();

            }

            if (escritorPares != null) {
                escritorPares.close();

            }
            
        }

    }

}
