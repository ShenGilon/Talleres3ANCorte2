package Guia3punto3;

public class Main {

    public static void main(String[] args) {
        int cantidad_nodos = 5;
        Nodo Cabeza = null;
        Nodo recorrer;
        if (cantidad_nodos > 0) {
            Cabeza = new Nodo();
            recorrer = Cabeza;
            int i = 0;
            while (i < cantidad_nodos) {
                System.out.print("Nombre del pais: ");
                recorrer.Pais = Leer.dato();
                System.out.print("Capital:");
                recorrer.Capital = Leer.dato();

                i++;
                if (i < cantidad_nodos) {
                    recorrer.sig = new Nodo();
                    recorrer.sig.ant = recorrer;
                    recorrer = recorrer.sig;
                }
            }
        }
        recorrer = Cabeza;
        System.out.println("Los Paises y Capitales almacenados son");

        System.out.println("   Pais: " + recorrer.Pais + "      Capital: " + recorrer.Capital);

        recorrer = recorrer.sig.sig.sig.sig;
        System.out.println("   Pais: " + recorrer.Pais + "      Capital: " + recorrer.Capital);
    }
}
