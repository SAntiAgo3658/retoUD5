package ejercicio4;

import java.io.Serializable;

public class Persona implements Serializable, Comparable {

    // Atributos

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructores

    public Persona() {
        this.dni = null;
        this.nombre = null;
        this.apellidos = null;
        this.edad = -1;

    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    // Getters y setters

    public String getDni() {
        return dni;

    }

    public void setDni(String dni) {
        this.dni = dni;

    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getApellidos() {
        return apellidos;

    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }

    public int getEdad() {
        return edad;

    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    // Métodos

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";

    }

    public int compareTo(Object object) {

        if (object.getClass() != this.getClass()) {
            return 1; // Si el parámetro no es una persona.

        } else {
            Persona persona = (Persona) object;

            if (this.edad > persona.edad) {
                return 1; // Si mi objeto es mejor.

            } else if (this.edad == persona.edad) {
                return 0; // Si son iguales.

            } else {
                return -1; // Si mi objeto es peor.

            }

        }

    }

}
