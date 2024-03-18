package ejercicio4;

import java.io.Serializable;

public class Persona implements Serializable {

    // Atributos

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor

    public Persona() {
        this.dni = null;
        this.nombre = null;
        this.apellidos = null;
        this.edad = -1;

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

}
