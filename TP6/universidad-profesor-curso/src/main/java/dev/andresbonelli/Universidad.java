package dev.andresbonelli;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores;
    private final List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (null != curso && null != profesor) {
            curso.setProfesor(profesor);
            System.out.println("Asignado: " + profesor.getNombre() +
                    " → " + curso.getNombre());
        } else {
            System.out.println("[ERROR] - No se pudo realizar la asignación.");
        }
    }

    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE '" + nombre + "' ===");
        if (profesores.isEmpty()) {
            System.out.println("No se encontraron profesores.");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\n=== CURSOS DE '" + nombre + "' ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public String eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con profesor
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            return curso.getNombre();
        }
        return null;
    }

    public String eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Antes de remover, dejar null los cursos que dictaba
            List<Curso> cursosACopiar = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosACopiar) {
                curso.setProfesor(null);
            }
            profesor.getCursos().clear();
            profesores.remove(profesor);
            return profesor.getNombre();
        }
        return null;
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor p : profesores) {
            p.listarCursos();
        }
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
}
