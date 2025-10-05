package dev.andresbonelli.bibliotecaLibros;

public class Main {
    public static void main(String[] args) {
        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Andres");

        // 2. Crear al menos tres autores
        System.out.println("=== CREANDO AUTORES ===");
        Autor autor1 = new Autor( "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor( "J.K. Rowling", "Británica");
        Autor autor3 = new Autor( 10L,"Mario Vargas Llosa", "Peruana");

        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();

        // 3. Agregar 5 libros a la biblioteca
        System.out.println("\n=== AGREGANDO LIBROS ===");
        biblioteca.agregarLibro("978-84-376-0494-7", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0-7475-3269-9", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("978-84-663-2908-1", "La ciudad y los perros", 1963, autor3);
        biblioteca.agregarLibro("978-0-7475-4215-5", "Harry Potter y la cámara secreta", 1998, autor2);
        biblioteca.agregarLibro("978-84-376-0495-4", "El amor en los tiempos del cólera", 1985, autor1);

        // 4. Listar todos los libros
        biblioteca.listarLibros();

        // 5. Buscar un libro por ISBN
        System.out.println("\n=== BÚSQUEDA POR ISBN ===");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("978-0-7475-3269-9");
        if (null != libroEncontrado) {
            libroEncontrado.mostrarInfo();
        }

        // 6. Filtrar libros por año específico
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7. Eliminar un libro por ISBN
        System.out.println("\n=== ELIMINANDO LIBRO ===");
        Libro eliminado = biblioteca.eliminarLibro("978-0-7475-4215-5");
        if (null != eliminado) {
            System.out.println("Libro eliminado: ");
            eliminado.mostrarInfo();
        }
        biblioteca.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("\n=== CANTIDAD TOTAL DE LIBROS ===");
        System.out.println("Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
