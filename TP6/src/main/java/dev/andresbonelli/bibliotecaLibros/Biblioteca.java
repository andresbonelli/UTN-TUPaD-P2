package dev.andresbonelli.bibliotecaLibros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

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
        System.out.println("\n=== LIBROS EN LA BIBLIOTECA '" + nombre + "' ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
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
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en " + anio);
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        libros.stream()
                .map(Libro::getAutor)
                .distinct() // requiere que Autor tenga implementado equals() y hashCode()
                .toList()
                .forEach(Autor::mostrarInfo);
    }

    public String getNombre() { return nombre; }
}
