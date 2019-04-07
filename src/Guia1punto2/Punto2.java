package Guia1punto2;

public class Punto2 {

    public static void main(String[] args) {
        Nodo Cabeza = new Nodo();
        Cabeza.Nombre = "Camilo";
        Cabeza.cc = 652145828;
        Cabeza.Celular = 311452845;
        Cabeza.Correo = "Camilo@gmail.com";
        Cabeza.Cargo = "Ing en Sistemas";

        Cabeza.siguiente = new Nodo();
        Cabeza.siguiente.Nombre = "Carlos";
        Cabeza.siguiente.cc = 541247891;
        Cabeza.siguiente.Celular = 322451879;
        Cabeza.siguiente.Correo = "Carlos@gmail.com";
        Cabeza.siguiente.Cargo = "Ing Civil";

        Cabeza.siguiente.siguiente = new Nodo();
        Cabeza.siguiente.siguiente.Nombre = "Jose";
        Cabeza.siguiente.siguiente.cc = 631524855;
        Cabeza.siguiente.siguiente.Celular = 311245826;
        Cabeza.siguiente.siguiente.Correo = "Jose@gmail.com";
        Cabeza.siguiente.siguiente.Cargo = "Contador";

        Cabeza.siguiente.siguiente.siguiente = new Nodo();

        Cabeza.siguiente.siguiente.siguiente.Nombre = "Maria";
        Cabeza.siguiente.siguiente.siguiente.cc = 663215148;
        Cabeza.siguiente.siguiente.siguiente.Celular = 315844474;
        Cabeza.siguiente.siguiente.siguiente.Correo = "Maria@gmail.com";
        Cabeza.siguiente.siguiente.siguiente.Cargo = "Periodista";

        System.out.println(Cabeza.Nombre);
        System.out.println(Cabeza.cc);
        System.out.println(Cabeza.Celular);
        System.out.println(Cabeza.Correo);
        System.out.println(Cabeza.Cargo);

        System.out.println("");

        System.out.println(Cabeza.siguiente.Nombre);
        System.out.println(Cabeza.siguiente.cc);
        System.out.println(Cabeza.siguiente.Celular);
        System.out.println(Cabeza.siguiente.Correo);
        System.out.println(Cabeza.siguiente.Cargo);

        System.out.println("");

        System.out.println(Cabeza.siguiente.siguiente.Nombre);
        System.out.println(Cabeza.siguiente.siguiente.cc);
        System.out.println(Cabeza.siguiente.siguiente.Celular);
        System.out.println(Cabeza.siguiente.siguiente.Correo);
        System.out.println(Cabeza.siguiente.siguiente.Cargo);

        System.out.println("");

        System.out.println(Cabeza.siguiente.siguiente.siguiente.Nombre);
        System.out.println(Cabeza.siguiente.siguiente.siguiente.cc);
        System.out.println(Cabeza.siguiente.siguiente.siguiente.Celular);
        System.out.println(Cabeza.siguiente.siguiente.siguiente.Correo);
        System.out.println(Cabeza.siguiente.siguiente.siguiente.Cargo);
    }

}
