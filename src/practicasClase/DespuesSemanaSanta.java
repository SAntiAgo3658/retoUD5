package practicasClase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DespuesSemanaSanta {

    public static void main(String[] args) {

        Staff[] staffs = new Staff[10];

        for (int i = 0; i < staffs.length; i++) {
            Staff staff = new Staff("José Ramón Rodríguez Garrido");
            staffs[i] = staff;
            System.out.println(staffs[i].getNombre().toUpperCase().toLowerCase());
            System.out.println(staffs[i].getNombre());

        }

        String nombre1 = "José Ramón Rodríguez Garrido";

        int cont = 0;
        boolean verdad = false;

        while ((cont < staffs.length) && (staffs[cont].getNombre().equals(nombre1))) {
            cont++;

        }

        if (cont == 10) {
            verdad = true;

        }

        System.out.println(verdad);

        List<Staff> listaStaffs = new ArrayList<Staff>();

        for (int i = 0; i < 10; i++) {
            listaStaffs.add(new Staff("Pedro" + (9 - i)));

        }

        System.out.println(listaStaffs.size());

        Set<Staff> setStaffs = new HashSet<Staff>();

        for (int i = 0; i < 10; i++) {
            setStaffs.add(new Staff("Paco"));

        }

        System.out.println(setStaffs.size());

    }

    // Mala praxis.

}

class Staff implements Comparable {

    private static int cont = 0;
    private String nombre = null;

    public Staff(String nombre) {
        this.nombre = nombre;
        cont++;

    }

    public static int getCont() {
        return cont;

    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public int compareTo(Object o) {

        if (o.getClass() != this.getClass()) {
            return 1;

        } else {
            Staff staff = (Staff) o;
            return (this.nombre.compareTo(staff.getNombre()));

        }

    }

}
