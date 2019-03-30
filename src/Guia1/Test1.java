package Guia1;

public class Test1 {

    public static void main(String[] args) {

        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 100;
        while (contador <= 800) {
            recorrer.info = contador;
            if (contador < 800) {
                recorrer.siguiente = new Nodo();
            }
            recorrer = recorrer.siguiente;
            contador += 100;
            if (contador == 700) contador += 50;
            if (contador == 850) contador -= 50;
        }
        recorrer = Cabeza;
        while (recorrer != null) {
            System.out.println(recorrer.info);
            recorrer = recorrer.siguiente;
        }
    }
}
