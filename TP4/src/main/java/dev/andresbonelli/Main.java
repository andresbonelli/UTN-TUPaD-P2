package dev.andresbonelli;

public class Main {

    public static void main(String[] args) {
        System.out.println("===== TP 4 PROGRAMACION ORIENTADA A OBJETOS =====\n");

        System.out.println("\nCREACIÓN DE EMPLEADOS\n");
        System.out.println("1. Ejemplo de crear empleado con constructor completo...\n");
        Empleado e1 = new Empleado(1, "Ana", "Gerente de Ventas", 75000.0);
        System.out.println("   ✅ " + e1);
        System.out.println("\n2. Ejemplo de crear empleado con constructor sobrecargado...\n");
        Empleado e2 = new Empleado("Juan", "Desarrollador", 60000.0);
        System.out.println("   ✅ " + e2);
        System.out.println("\n3. Creando más empleados...");
        Empleado e3 = new Empleado("María", "Diseñadora UX", 55000.0);
        Empleado e4 = new Empleado(10, "Carlos", "Analista Funcional", 55000.0);
        Empleado e5 = new Empleado("Laura", "PO",70000.0);
        System.out.println("   ✅ " + e3);
        System.out.println("   ✅ " + e4);
        System.out.println("   ✅ " + e5);
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());

        System.out.println("\nACTUALIZACIÓN DE SALARIOS\n");
        System.out.println("Estado antes de los aumentos:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println("\n🔄 Aplicando aumentos...");
        System.out.println("\nAumento por porcentaje:");
        System.out.println("  Salario anterior: $" + String.format("%.2f", e1.getSalario()));
        e1.actualizarSalario(15.0);
        System.out.println("  " + e1);
        System.out.println("\nAumento por cantidad fija");
        System.out.println("  Salario anterior: $" + String.format("%.2f", e2.getSalario()));
        e2.actualizarSalario(8000);
        System.out.println("  " + e2);

        System.out.println("\n CASOS DE PRUEBA");
        System.out.println("Probando validaciones:");
        System.out.print("Intentar aumentar un porcentaje negativo: \n");
        e1.actualizarSalario(-5.0);
        System.out.print("Intentar aumentar cantidad negativa: \n");
        e2.actualizarSalario(-1000);

        System.out.println("\n RESUMEN");
        System.out.println("Estado final de todos los empleados:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}