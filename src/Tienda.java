import java.util.ArrayList;

/**
 * Clase Tienda
 * Administra una lista de productos y permite mostrarlos.
 */
public class Tienda {

    // Lista donde se almacenan los productos
    private ArrayList<Producto> productos;

    /**
     * Constructor de la clase Tienda.
     * Inicializa la lista de productos.
     */
    public Tienda() {
        productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la tienda.
     * @param producto Producto que se desea agregar
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Muestra todos los productos registrados.
     */
    public void mostrarCatalogo() {

        System.out.println("CATALOGO DE PRODUCTOS");
        System.out.println("=====================");

        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }
}