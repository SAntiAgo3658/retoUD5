package practicasClase;

public class DespuesSemanaSanta {

    public static void main(String[] args) {

        Staff[] staffs = new Staff[10];

        for (int i = 0; i < staffs.length; i++) {
            Staff staff = new Staff("Paco");
            staffs[i] = staff;

        }

        System.out.println(Staff.getCont() == staffs.length);

    }

}

class Staff {

    private static int cont = 0;
    private String nombre;

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

}
