package Guia1;

public class Test1 {

    public static void main(String[] args) {

        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 2;
        while (contador <= 10) {
            recorrer.info = contador;
            if (contador < 10) {
                recorrer.siguiente = new Nodo();
            }
            recorrer = recorrer.siguiente;
            contador += 2;
        }
        recorrer = Cabeza;
        while (recorrer != null) {
            System.out.println(recorrer.info);
            recorrer = recorrer.siguiente;
        }
    }
}
