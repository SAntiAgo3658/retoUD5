package ejercicio4;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

        // Atributos

        List<Persona> personas = new ArrayList<Persona>();
        Persona persona;

        char sino;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Quieres introducir una persona?");
        sino = teclado.nextLine().toUpperCase().charAt(0);

        while (sino == 'S') {
            persona = new Persona();

            System.out.println("Introduce una edad");
            persona.setEdad(teclado.nextInt());

            teclado.nextLine();

            System.out.println("Introduce un dni");
            persona.setDni(teclado.nextLine());

            System.out.println("Introduce un nombre");
            persona.setNombre(teclado.nextLine());

            System.out.println("Introduce unos apellidos");
            persona.setApellidos(teclado.nextLine());

            personas.add(persona);

            System.out.println("Hasta ahora has introducido " + personas.size() + " personas.");

            System.out.println("¿Quieres introducir otra persona?");
            sino = teclado.nextLine().toUpperCase().charAt(0);

        }

        for (Persona personaActual : personas) {

            System.out.println(personaActual.toString());

        }

        ObjectOutputStream escritor = null;

        try {
            escritor = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("listaPersonas.dat", true)));
            for (Persona persona2 : personas) {
                escritor.writeObject(persona2);

            }

        } catch (FileNotFoundException e) {
            e.getMessage();

        } finally {
            if (escritor != null) {
                escritor.close();

            }

        }

        ObjectInputStream lector = null;
        Persona person;

        try {
            lector = new ObjectInputStream(new BufferedInputStream(new FileInputStream("listaPersonas.dat")));
            for (Persona persona3 : personas) {
                 person = (Persona) lector.readObject();
                 System.out.println(person);


            }

        } catch (FileNotFoundException e) {
            e.getMessage();

        } catch (ClassNotFoundException e) {
            e.getMessage();

        } finally {
            if (lector != null) {
                lector.close();

            }

        }

        teclado.close();

    }

}
