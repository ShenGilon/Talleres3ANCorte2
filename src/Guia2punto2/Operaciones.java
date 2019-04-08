package Guia2punto2;


public class Operaciones {

   public Nodo añadir(Nodo lista, Nodo nuevo) {
        if (lista != null) {
            Nodo recorrer = lista;
            while (recorrer.siguiente != null) {
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = nuevo;
            nuevo.siguiente = null;
        } else {
            lista = nuevo;
        }
        return lista;
    }

    public Nodo eliminar(Nodo lista, String nombreProducto) {
        Nodo recorrer = lista;
        Nodo anterior = null;
        while ((recorrer != null) && (!recorrer.informacion.Nombre.equals(nombreProducto))) {
            anterior = recorrer;
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            if (anterior != null) {
                anterior.siguiente = recorrer.siguiente;
                recorrer.siguiente = null;
            } else if (anterior == null) {
                lista = recorrer.siguiente;
                recorrer.siguiente = null;
            }
            System.out.println("Producto eliminado");
        } else {
            System.out.println("No existe el producto");
        }
        return lista;
    }

    public Nodo buscar(Nodo lista, String nombreProducto) {
        Nodo recorrer = lista;
        while ((recorrer != null) && (!recorrer.informacion.Nombre.equals(nombreProducto))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            return recorrer;
        } else {
            return null;
        }
    }

    public Nodo modificar(Nodo lista, String ProductoBuscado, String nuevoProducto, long nuevoCodigo, String nuevaPresentacion, int nuevaCantidad, float nuevoValorUnitario, float nuevoValorTotal) {
        Nodo recorrer = lista;
        while ((recorrer != null) && (!recorrer.informacion.Nombre.equals(ProductoBuscado))) {

            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            recorrer.informacion.Nombre = nuevoProducto;
            recorrer.informacion.Codigo = nuevoCodigo;
            recorrer.informacion.Presentacion = nuevaPresentacion;
            recorrer.informacion.Cantidad = nuevaCantidad;
            recorrer.informacion.ValorUnitario = nuevoValorUnitario;
            recorrer.informacion.ValorTotal = nuevoValorTotal;
        }
        return lista;
    }

    public void listar(Nodo lista) {
        Nodo recorrer = lista;
        System.out.println("----------------------------------------------------");
        while (recorrer != null) {
            System.out.println("Nombre: " + recorrer.informacion.Nombre);
            System.out.println("Codigo: " + recorrer.informacion.Codigo);
            System.out.println("Presentacion: " + recorrer.informacion.Presentacion);
                    System.out.println("Cantidad: " + recorrer.informacion.Cantidad);
                    System.out.println("Valor Unitario: " + recorrer.informacion.ValorUnitario);
                    System.out.println("Valor Total: " + recorrer.informacion.ValorTotal);
            System.out.println("----------------------------------------------------");
            recorrer = recorrer.siguiente;
        }
    }
}