package Guia2punto1;


public class P {

    public Nodo añadir(Nodo lista, Nodo nuevo, boolean inicio) {

        if (lista != null) {
            if (inicio) {
                nuevo.siguiente = lista;
                lista = nuevo;
            } else {
                Nodo recorrer = lista;
                while (recorrer.siguiente != null) {
                    recorrer = recorrer.siguiente;
                }
                recorrer.siguiente = nuevo;
                nuevo.siguiente = null;
            }
        } else {
            lista = nuevo;
        }
        return lista;
    }

    public void listar(Nodo lista) {
        Nodo recorrer = lista;
        while (recorrer != null) {
            System.out.print(recorrer.informacion + " ");
            recorrer = recorrer.siguiente;
        }
    }
}
