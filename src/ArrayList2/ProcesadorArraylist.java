package ArrayList2;

import java.util.ArrayList;

public class ProcesadorArraylist {

    public void imprimirArraylistFacturas(ArrayList<personas> arl) {
        int i = 0, cantidadHombres = 0, cantidadMujeres = 0;
        float promEdad = 0, promEstatura = 0;
        System.out.println("Estudiante \t\t\t Documento\t\t\tNota 1\t\t\tNota 2\t\t\tNota 3\t\t\tDefinitiva");
        while (i < arl.size()) {
            System.out.println(arl.get(i).CC + "\t\t" + arl.get(i).edad + "\t\t\t" + arl.get(i).peso + "\t\t\t" + arl.get(i).estatura + "\t\t\t" + arl.get(i).nHermanos + "\t\t\t" + arl.get(i).nVendiciones + "\t\t\t" + arl.get(i).sexo);
            promEdad += arl.get(i).edad;
            promEstatura += arl.get(i).estatura;
            if (arl.get(i).sexo == "hombre") cantidadHombres++;
            if (arl.get(i).sexo == "mujer") cantidadMujeres++;
            i++;
        }
        System.out.println("el promedio de edades es "+ (promEdad/arl.size()));
        System.out.println("el promedio de estatura es "+ (promEstatura/arl.size()));
        System.out.println("La cantidad de hombres es " + cantidadHombres);
        System.out.println("La cantidad de mujeres es " + cantidadMujeres);
    }
}
