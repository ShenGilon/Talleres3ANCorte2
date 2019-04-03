package Guia3punto4;

public class Main {

    public static void main(String[] args) {
        Nodo Cabeza = new Nodo();
        Cabeza.info = 2;
        Cabeza.sig = new Nodo();
        Cabeza.sig.info = 3;
        Cabeza.sig.sig = new Nodo();
        Cabeza.sig.sig.info = 5;
        Cabeza.sig.sig.sig = new Nodo();
        Cabeza.sig.sig.sig.info = 6;
        Cabeza.sig.sig.sig.sig = new Nodo();
        Cabeza.sig.sig.sig.sig.info = 7;
        Cabeza.sig.sig.sig.sig.sig = new Nodo();
        Cabeza.sig.sig.sig.sig.sig.info = 9;
        Nodo recorrido = Cabeza;
        Nodo recorrido1 = null;
        System.out.println("BUSCAR NUMERO DE 1 A 10");
        System.out.println("Que numero desea buscar?");
        int x = Leer.datoInt();
        int z = 0;
        while (recorrido != null) {

            if (recorrido.info == x) {
                System.out.println("El numero " + x + " si esta");
                z = 1;
            }

            recorrido = recorrido.sig;

        }
        if (z == 0) {
            System.out.println("El numero " + x + " no esta");
        }

    }
}
