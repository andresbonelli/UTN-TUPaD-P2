package dev.andresbonelli;

public class Producto {
    private final Long id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    private static int totalProductos = 0;

    private static Long siguienteId = 1L;

    public Producto(String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = siguienteId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        totalProductos++;
        siguienteId++;
    }

    public Producto(Long id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        if (id >= siguienteId) {
            this.id = id;
            siguienteId = id + 1;
        } else {
            this.id = siguienteId;
            siguienteId++;
        }
        totalProductos++;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio +
                " | Cantidad: " + cantidad + " | Categoría: " + categoria +
                " (" + categoria.getDescripcion() + ")");
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }
}
