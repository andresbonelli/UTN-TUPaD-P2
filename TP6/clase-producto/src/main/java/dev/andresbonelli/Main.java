package dev.andresbonelli;


public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear y agregar cinco productos
        System.out.println("=== AGREGANDO PRODUCTOS ===");
        inventario.agregarProducto(new Producto( "Arroz", 1500.0, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto( "Smartphone", 25000.0, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("Camisa", 2500.0, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto(10L,"Sartén", 1800.0, 20, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("Leche", 800.0, 100, CategoriaProducto.ALIMENTOS));

        // 2. Listar todos los productos
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n=== BÚSQUEDA POR ID ===");
        Producto encontrado = inventario.buscarProductoPorId(2L);
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        }

        // 4. Filtrar por categoría
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto
        System.out.println("\n=== ELIMINANDO PRODUCTO ===");
        Producto eliminado = inventario.eliminarProducto(3L);
        if (eliminado != null) {
            System.out.println("Producto eliminado:");
            eliminado.mostrarInfo();
        }
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== ACTUALIZANDO STOCK ===");
        inventario.actualizarStock(1L, 200);

        // 7. Mostrar total de stock
        System.out.println("\n=== TOTAL DE STOCK ===");
        System.out.println("Total de unidades en stock: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }

        // 9. Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}