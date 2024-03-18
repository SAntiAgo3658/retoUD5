package ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio3 {

    // Leer num + hasta introducir un num negativo
    // Almacenar el num en el fichero "Tres.dat" OJO
    // USANDO OBJECTS

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("src//Ejercicio3//Tres.dat"));
            System.out.println("Introduce número:");
            Integer num = teclado.nextInt();

            while (num > -1) {
                escritor.writeObject(num);
                System.out.println("Introduce número:");
                num = teclado.nextInt();

            }

        } catch (FileNotFoundException e) {
            e.getMessage();

        } finally {
            if (escritor != null) {
                escritor.close();

            }
        }

        ObjectInputStream lector = null;
        escritor = null;

        try {
            lector = new ObjectInputStream(new FileInputStream("src//Ejercicio3//Tres.dat"));
            escritor = new ObjectOutputStream(new FileOutputStream("src//Ejercicio3//Trescopia.dat"));
            Integer escribir;
            System.out.println(lector.available());

            while (lector.available() > 0) {
                escribir = (Integer) lector.readObject();
                escritor.writeObject(escribir);
                System.out.println(escribir);

            }

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.getMessage();

        } finally {
            if (lector != null) {
                lector.close();

            }

            if (escritor != null) {
                escritor.close();

            }
        }

        teclado.close();

    }

}
