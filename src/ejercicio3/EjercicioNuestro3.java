package ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioNuestro3 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[3];
        String[] asig = new String[3];
        String nombre;

        for (int al = 0; al < 3; al++) {
            System.out.println("Creación alumno " + al);
            System.out.println("Nombre");
            nombre = teclado.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.println("Asignatura " + j + ": ");
                asig[j] = teclado.nextLine();

            }

            alumnos[al] = new Alumno(nombre, asig);

        }

        for (int cont = 0; cont < 3; cont++) {
            System.out.println(alumnos[cont].getId());

        }

        System.out.println(Alumno.getidActual());

        ObjectOutputStream escritor = null;
        String pathFichero = "src//ejercicio3//tres.dat";

        try {

            escritor = new ObjectOutputStream(new FileOutputStream(pathFichero, true));
            escritor.writeObject(alumnos[0]);
            escritor.writeObject(alumnos[1]);
            escritor.writeObject(alumnos[2]);

        } catch (FileNotFoundException e) {
            e.getMessage();

        } finally {
            if (escritor != null) {
                escritor.close();

            }
        }

        alumnos[0] = null;
        alumnos[1] = null;
        alumnos[2] = null;
        ObjectInputStream lector = null;

        try {
            lector = new ObjectInputStream(new FileInputStream(pathFichero));
            int cont = 0;

            while (lector.available() > 0) {
                alumnos[cont] = (Alumno) lector.readObject();
                System.out.println(alumnos[cont].getNombre());
                cont++;

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

class Alumno implements Serializable {

    // Atributos

    private static int idActual = 0;
    private int id;
    private String nombre;
    private String[] asignaturas;

    // constructor

    public Alumno(String nombre, String[] asignaturas) {
        idActual++;
        this.id = idActual;
        this.nombre = nombre;
        this.asignaturas = asignaturas;

    }

    // Getters y Setters

    public static int getidActual() {
        return idActual;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    // ToString

    public void escribir() {
        System.out.println(
                "Alumno [id=" + id + ", nombre=" + nombre + ", asignaturas=" + Arrays.toString(asignaturas) + "]");

    }

}
