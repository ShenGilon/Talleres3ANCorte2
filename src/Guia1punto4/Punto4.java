package Guia1punto4;

public class Punto4 {

    public static void main(String[] args) {
        Nodo Cabeza = new Nodo();
        Nodo valor = Cabeza;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Ingrese la marca");
            valor.Marca = Leer.dato();
            System.out.println("Ingrese la placa");
            valor.Placa = Leer.dato();
            System.out.println("Ingrese el nombre del dueño");
            valor.Dueño = Leer.dato();
            System.out.println("Ingrese el color");
            valor.Color = Leer.dato();

            valor.sig = new Nodo();
            valor.sig.ant = Cabeza;
            valor = valor.sig;

        }

        valor = Cabeza;
        for (int i = 0; i <= 3; i++) {

            System.out.println(valor.Marca);
            System.out.println(valor.Placa);
            System.out.println(valor.Dueño);
            System.out.println(valor.Color);


            valor.sig = new Nodo();
            valor.sig.ant = Cabeza;
            valor = valor.sig;

        }

    }

}

