package dev.andresbonelli.bibliotecaLibros;

import java.util.Objects;

public class Autor {
    private final Long id;
    private String nombre;
    private String nacionalidad;
    private static int totalAutores = 0;
    private static Long siguienteId = 1L;

    public Autor(String nombre, String nacionalidad) {
        this.id = siguienteId;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        totalAutores++;
        siguienteId++;
    }

    public Autor(Long id, String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        if (id >= siguienteId) {
            this.id = id;
            siguienteId = id + 1;
        } else {
            this.id = siguienteId;
            siguienteId++;
        }
        totalAutores++;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Nacionalidad: " + nacionalidad);
    }

    public Long getId() { return id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre) && Objects.equals(nacionalidad, autor.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nacionalidad);
    }
}
