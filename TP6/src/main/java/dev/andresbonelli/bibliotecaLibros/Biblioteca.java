package dev.andresbonelli.bibliotecaLibros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final String nombre;
    private final List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\n=== LIBROS EN LA BIBLIOTECA '" + nombre + "' ===");
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        return libros.stream()
                .filter(libro -> libro.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    public Libro eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (null != libro) {
            libros.remove(libro);
        }
        return libro;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        libros.stream()
                .filter(libro -> libro.getAnioPublicacion() == anio)
                .forEach(Libro::mostrarInfo);
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        libros.stream()
                .map(Libro::getAutor)
                .distinct() // requiere que Autor tenga implementado equals() y hashCode()
                .toList()
                .forEach(Autor::mostrarInfo);
    }

    public String getNombre() { return nombre; }
}
