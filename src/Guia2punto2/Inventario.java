package Guia2punto2;

public class Inventario {

    public static void main(String[] args) {
        Nodo lista = null;
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("1. Agregar un producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Buscar un producto");
            System.out.println("4. Modifica un producto");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");
            System.out.println();
            System.out.print("Digite el numero de la opcion deseada: ");
            opcion = Leer.datoInt();
            System.out.println();
            if (opcion == 1) {
                Nodo nodo = new Nodo();
                System.out.println("Ingrese el nombre del producto:");
                nodo.informacion.Nombre = Leer.dato();
                System.out.println("Ingrese el codigo del producto:");
                nodo.informacion.Codigo = Leer.datoLong();
                System.out.println("Ingrese la presentacion del producto");
                nodo.informacion.Presentacion = Leer.dato();
                System.out.println("Ingrese la cantidad del proucto");
                nodo.informacion.Cantidad = Leer.datoInt();
                System.out.println("Ingrese el valor unitario del producto");
                nodo.informacion.ValorUnitario = Leer.datoFloat();
                nodo.informacion.ValorTotal = (nodo.informacion.Cantidad * nodo.informacion.ValorUnitario);
                System.out.println("El valor total de todas las unidades del producto es de: " + nodo.informacion.ValorTotal);
                System.out.println();
                lista = new Operaciones().añadir(lista, nodo);
            } else if (opcion == 2) {
                System.out.println("Ingrese el producto a eliminar :");
                String nombreProducto = Leer.dato();
                lista = new Operaciones().eliminar(lista, nombreProducto);
            } else if (opcion == 3) {
                System.out.println("Ingrese el producto a buscar :");
                String nombreProducto = Leer.dato();
                Nodo buscado = new Operaciones().buscar(lista, nombreProducto);
                if (buscado != null) {
                    System.out.println("Producto: " + buscado.informacion.Nombre);
                    System.out.println("Codigo: " + buscado.informacion.Codigo);
                    System.out.println("Presentacion: " + buscado.informacion.Presentacion);
                    System.out.println("Cantidad: " + buscado.informacion.Cantidad);
                    System.out.println("Valor Unitario: " + buscado.informacion.ValorUnitario);
                    System.out.println("Valor Total: " + buscado.informacion.ValorTotal);
                } else {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.println("Ingrese el producto a modificar:");
                String Producto = Leer.dato();
                System.out.println("Ingrese el nuevo nombre del producto:");
                String nProducto = Leer.dato();
                System.out.println("Ingrese el nuevo codigo del producto:");
                Long nCodigo = Leer.datoLong();
                System.out.println("Ingrese la nueva presentacion del producto:");
                String nPresentacion = Leer.dato();
                System.out.println("Ingrese la nueva cantidad del producto:");
                int nCantidad = Leer.datoInt();
                System.out.println("Ingrese el nuevo valor unitario del producto:");
                float nValorUnitario = Leer.datoFloat();
                float nValorTotal = (nCantidad * nValorUnitario);
                System.out.println("El nuevo valor total del producto es: " + nValorTotal);
                lista = new Operaciones().modificar(lista, Producto, nProducto, nCodigo, nPresentacion, nCantidad, nValorUnitario, nValorTotal);
            } else if (opcion == 5) {
                new Operaciones().listar(lista);
            }
        }
    }
}
