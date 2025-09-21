package dev.andresbonelli;

public class Libro {
    private final String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Título: " + titulo +
                " | Año: " + anioPublicacion + " | Autor: " + autor.toString());
    }

    // Getters
    public String getIsbn() { return isbn; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAutor(Autor autor) { this.autor = autor; }
    public Autor getAutor() { return autor; }
}
