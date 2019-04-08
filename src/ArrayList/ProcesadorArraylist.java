package ArrayList;

import java.util.ArrayList;

public class ProcesadorArraylist {

    public void imprimirArraylistFacturas(ArrayList<Estudiantes> arl) {
        int i = 0;
        float promedioGeneral=0;
        System.out.println("Estudiante \t\t\t Documento\t\t\tNota 1\t\t\tNota 2\t\t\tNota 3\t\t\tDefinitiva");
        while (i < arl.size()) {
            System.out.println(arl.get(i).Nombre + "\t\t" + arl.get(i).CC + "\t\t\t" + arl.get(i).nota1 + "\t\t\t" + arl.get(i).nota2 + "\t\t\t" + arl.get(i).nota3 + "\t\t\t" + arl.get(i).promedio);
            promedioGeneral += arl.get(i).promedio;
            i++;
        }
        System.out.println("El promedio del curso es "+ (promedioGeneral/3));
    }
}
