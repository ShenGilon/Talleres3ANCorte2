package Guia3punto1;

public class ListasDobleEncadenadas {

    public static void main(String[] args) {
        Nodo Cabeza = new Nodo();
        Nodo valor = Cabeza;
        for (int i = 3; i <= 11; i = i + 2) {
            valor.info = i;
            valor.sig = new Nodo();
            valor.sig.ant = Cabeza;
            valor = valor.sig;
        }

        Nodo recorrido = Cabeza;

        while (recorrido != null) {
            if (recorrido.info != 0) {
                System.out.println(recorrido.info);
            }
            recorrido = recorrido.sig;
        }
    }

}

