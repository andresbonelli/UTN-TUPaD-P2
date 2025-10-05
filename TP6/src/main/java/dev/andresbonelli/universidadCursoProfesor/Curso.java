package dev.andresbonelli.universidadCursoProfesor;

public class Curso {
    private final String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public void setProfesor(Profesor p) {
        if (null != this.profesor && p != this.profesor) {
            this.profesor.removerCursoSinSincronizar(this);
        }

        this.profesor = p;

        if (null != p && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String profesorInfo = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Código: " + codigo + " | Curso: " + nombre +
                " | Profesor: " + profesorInfo);
    }

    public String getCodigo() { return codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

}
