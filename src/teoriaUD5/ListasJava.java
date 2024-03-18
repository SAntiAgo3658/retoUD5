package teoriaUD5;

public class ListasJava {

    public static void main(String[] args) {

        ListaInt miLista = new ListaInt("miLista");

    }

}

class NodoListaInt {

    // Atributos

    public int numero;
    public NodoListaInt sig;

    // Constructor

    public NodoListaInt(int num, NodoListaInt nodoSig) {

        this.numero = num;
        this.sig = nodoSig;

    }

    // Métodos

    public NodoListaInt add(NodoListaInt nuevoNodo) {

        if (this.sig == null) {
            this.sig = nuevoNodo;

        } else {
            this.sig.add(nuevoNodo);

        }

    }

}

class ListaInt {

    // Atributos

    public String nombre;
    public NodoListaInt inicio;

    // Constructor

    public ListaInt(String nombre) {

        this.nombre = nombre;
        this.inicio = null;

    }

    // Métodos

    public void insertar(int num) {

        NodoListaInt nuevoNodo = new NodoListaInt(num, null);

        // Si la lista está vacía:

        if (inicio == null) {
            inicio = nuevoNodo;

        } else { // Al menos un elemento en la lista
            inicio.sig.add(nuevoNodo);

        }

    }

}
