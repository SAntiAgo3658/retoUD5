package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      Alumno[] alumnos = new Alumno[3];
      String[] asig = new String[3];
      String nombre;

      for (int al = 0; al < 3; al++){
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

      teclado.close();

       
       

    }

}

class Alumno {

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
