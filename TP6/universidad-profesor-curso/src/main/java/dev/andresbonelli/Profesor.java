package dev.andresbonelli;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private final String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  No se encontraron cursos asigandos a este profesor.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Profesor: " + nombre +
                " | Especialidad: " + especialidad +
                " | Cursos: " + cursos.size());
    }

    public String getId() { return id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }

    // Método interno para romper relaciones sin sincronización (usado en eliminación)
    protected void removerCursoSinSincronizar(Curso c) {
        cursos.remove(c);
    }
}
