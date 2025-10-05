package dev.andresbonelli.universidadCursoProfesor;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("UTN");

        // 1. Crear profesores y cursos
        System.out.println("=== CREANDO PROFESORES ===");
        Profesor p1 = new Profesor("P001", "Miguel Ángel Durán", "Programación");
        Profesor p2 = new Profesor("P002", "Brady Haran", "Matemáticas");
        Profesor p3 = new Profesor("P003", "Neil Degrasse Tyson", "Física");

        System.out.println("\n=== CREANDO CURSOS ===");
        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Álgebra Lineal");
        Curso c4 = new Curso("C004", "Física I");
        Curso c5 = new Curso("C005", "Estructuras de Datos");

        // 2. Agregar a la universidad
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        System.out.println("\n=== ASIGNANDO PROFESORES A CURSOS ===");
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C005", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");

        // 4. Listar cursos con su profesor y profesores con sus cursos
        universidad.listarCursos();
        universidad.listarProfesores();

        System.out.println("\n=== CURSOS POR PROFESOR ===");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // 5. Cambiar profesor de un curso
        System.out.println("\n=== CAMBIANDO PROFESOR DE CURSO ===");
        System.out.println("Antes del cambio:");
        c2.mostrarInfo();
        p1.listarCursos();
        p2.listarCursos();

        universidad.asignarProfesorACurso("C002", "P002");

        System.out.println("Después del cambio:");
        c2.mostrarInfo();
        p1.listarCursos();
        p2.listarCursos();

        // 6. Remover un curso
        System.out.println("\n=== REMOVIENDO CURSO ===");
        System.out.println("Antes de remover C005:");
        p1.listarCursos();
        String eliminado = universidad.eliminarCurso("C005");
        if (eliminado != null) {
            System.out.println("Curso eliminado: " + eliminado);
        } else {
            System.out.println("Curso no encontrado.");
        }
        System.out.println("Después de remover C005:");
        p1.listarCursos();

        // 7. Remover un profesor
        System.out.println("\n=== REMOVIENDO PROFESOR ===");
        System.out.println("Antes de remover profesor:");
        universidad.listarCursos();
        eliminado = universidad.eliminarProfesor("P003");
        if (eliminado != null) {
            System.out.println("Profesor eliminado: " + eliminado);
        } else {
            System.out.println("Profesor no encontrado.");
        }
        System.out.println("Después de remover profesor:");
        universidad.listarCursos();

        // 8. Mostrar reporte de cursos por profesor
        universidad.mostrarReporteCursosPorProfesor();

    }
}