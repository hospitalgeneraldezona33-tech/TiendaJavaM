/**
 * Clase Producto
 * Representa un producto de la tienda con nombre, precio y stock.
 */
public class Producto {

    // Atributos del producto
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor de la clase Producto.
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param stock Cantidad disponible en inventario
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra la información del producto en pantalla.
     */
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("--------------------");
    }
}