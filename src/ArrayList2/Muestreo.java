package ArrayList2;

import java.util.ArrayList;

public class Muestreo {

    public static void main(String[] args) {
        ArrayList<personas> al = new ArrayList<personas>();
        personas fac = new personas();
        System.out.println("Ingrese cuantas personas se encuestaron en el muestreo");
        int cant = Leer.datoInt();
        for (int i = 0; i < cant; i++) {
            fac = new personas();
            System.out.println("Ingrese el número de documento de identidad de la persona " + (i + 1));
            fac.CC = Leer.dato();
            System.out.println("Ingrese la edad de la persona " + (i + 1));
            fac.edad = Leer.datoInt();
            System.out.println("Ingrese el peso de la persona " + (i + 1));
            fac.peso = Leer.datoFloat();
            System.out.println("Ingrese la estatura de la persona " + (i + 1));
            fac.estatura = Leer.datoFloat();
            System.out.println("Ingrese el número de hermanos de la persona " + (i + 1));
            fac.nHermanos = Leer.datoInt();
            System.out.println("Ingrese el número de hijos de la persona " + (i + 1));
            fac.nVendiciones = Leer.datoInt();
            System.out.println("Ingrese el sexo de la persona " + (i + 1));
            fac.sexo = Leer.dato();
            al.add(fac);
            System.out.println(""); 
        }
        ProcesadorArraylist p = new ProcesadorArraylist();
        p.imprimirArraylistFacturas(al);

    }

}
