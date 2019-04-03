package Guia3punto2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cantidad de telefonos");
        int cantidad_nodos = Leer.datoInt();
        Nodo Cabeza = null;
        Nodo recorrer;
        if (cantidad_nodos > 0) {
            Cabeza = new Nodo();
            recorrer = Cabeza;
            int i = 0;
            while (i < cantidad_nodos) {
                System.out.print("Marca del telefono: ");
                recorrer.Marca = Leer.dato();
                System.out.print("Modelo: ");
                recorrer.modelo = Leer.dato();
                System.out.print("numero: ");
                recorrer.numero = Leer.dato();
                System.out.print("Dueño: ");
                recorrer.dueño = Leer.dato();
                System.out.print("Cedula del Dueño: ");
                recorrer.cc_dueño = Leer.dato();
                i++;
                if (i < cantidad_nodos) {
                    recorrer.sig = new Nodo();
                    recorrer.sig.ant = recorrer;
                    recorrer = recorrer.sig;
                }
            }
        }
        recorrer = Cabeza;
        System.out.println("Los datos almacenados son");
        while (recorrer != null) {
            System.out.println("   Marca del telefono: " + recorrer.Marca + "      Modelo: " + recorrer.modelo + "      Numero: " + recorrer.numero + "      Dueño: " + recorrer.dueño+ "      Cedula del Dueño: " + recorrer.cc_dueño);
            recorrer = recorrer.sig;
        }
    }
}
