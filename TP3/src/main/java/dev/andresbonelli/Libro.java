package dev.andresbonelli;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // Usamos el setter
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("[ERROR] - Año inválido: " + anioPublicacion);
        }
    }

    @Override
    public String toString() {
        return "Libro: " + this.titulo + " de " + this.autor + " (" + this.anioPublicacion + ")";
    }
}

