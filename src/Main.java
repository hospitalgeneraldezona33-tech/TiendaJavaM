/**
 * Clase principal del programa.
 * Crea la tienda y registra los productos.
 */
public class Main {

    public static void main(String[] args) {

        // Crear objeto Tienda
        Tienda tienda = new Tienda();

        // Crear los productos mediante instanciación
        Producto p1 = new Producto("Laptop", 15000, 5);
        Producto p2 = new Producto("Mouse", 250, 20);
        Producto p3 = new Producto("Teclado", 450, 15);
        Producto p4 = new Producto("Monitor", 3500, 8);
        Producto p5 = new Producto("Memoria USB", 180, 30);

        // Agregar productos a la tienda
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);
        tienda.agregarProducto(p4);
        tienda.agregarProducto(p5);

        // Mostrar catálogo de productos
        tienda.mostrarCatalogo();
    }
}