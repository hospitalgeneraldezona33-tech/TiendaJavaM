import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarCatalogo() {

        System.out.println("CATALOGO DE PRODUCTOS");
        System.out.println("=====================");

        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }
}
