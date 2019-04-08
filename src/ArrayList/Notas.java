package ArrayList;

import java.util.ArrayList;

public class Notas {

    public static void main(String[] args) {
        ArrayList<Estudiantes> al = new ArrayList<Estudiantes>();
        Estudiantes fac = new Estudiantes();
        System.out.println("A continuación se van a capturar los datos de tres estudiantes");
        int cant = 3;
        for (int i = 0; i < cant; i++) {
            fac = new Estudiantes();
            System.out.println("Ingrese el Nombre del estudiante " + (i + 1));
            fac.Nombre = Leer.dato();
            System.out.println("Ingrese el documento de identidad del estudiante " + (i + 1));
            fac.CC = Leer.dato();
            System.out.println("Ingrese la primera nota");
            fac.nota1 = Leer.datoFloat();
            System.out.println("Ingrese la segunda nota");
            fac.nota2 = Leer.datoFloat();
            System.out.println("Ingrese la tercera nota");
            fac.nota3 = Leer.datoFloat();
            fac.promedio = (fac.nota1 + fac.nota2 + fac.nota3) / 3;
            al.add(fac);
        }
        ProcesadorArraylist p = new ProcesadorArraylist();
        p.imprimirArraylistFacturas(al);

    }

}
