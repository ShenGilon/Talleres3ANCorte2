package Guia2punto1;


public class NumerosPares {

    public static void main(String[] args) {
        Nodo lista = null;
        P op = new P();
        int numero = 0;

        for (int i = 60; i <= 80; i = i + 2) {
            Nodo nodo = new Nodo();
            nodo.informacion = i;
            lista = op.añadir(lista, nodo, false);
        }
        System.out.println();
        System.out.println("Lista Original: ");
        op.listar(lista);
        System.out.println();
        System.out.print("Ingrese un numero para adicionar al inicio de la lista: ");
        numero = Leer.datoInt();
        Nodo nodoInicio = new Nodo();
        nodoInicio.informacion = numero;
        lista = op.añadir(lista, nodoInicio, true);
        System.out.println();
        System.out.print("Ingrese un numero para adicionar al final de la lista: ");
        numero = Leer.datoInt();
        Nodo nodoFin = new Nodo();
        nodoFin.informacion = numero;
        lista = op.añadir(lista, nodoFin, false);
        System.out.println();
        System.out.print("Lista Modificada: ");
        op.listar(lista);
    }
}
