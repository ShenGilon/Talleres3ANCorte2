package Guia1punto3;

public class Punto3 {

    public static void main(String[] args) {

        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 200;
        while (contador <= 300) {
            recorrer.info = contador;
            if (contador < 300) {
                recorrer.siguiente = new Nodo();
            }
            recorrer = recorrer.siguiente;
            contador += 20;
            if (contador == 280) contador += 20;
        }
        recorrer = Cabeza;
        while (recorrer != null) {
            System.out.println(recorrer.info);
            recorrer = recorrer.siguiente;
        }
    }
}
