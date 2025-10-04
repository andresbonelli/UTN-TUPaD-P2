package dev.andresbonelli.empleadosPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Pérez", 101, 3000.0, 500.0));
        empleados.add(new EmpleadoTemporal("María García", 102, 15.0, 120));
        empleados.add(new EmpleadoPlanta("Carlos López", 103, 3500.0, 700.0));
        empleados.add(new EmpleadoTemporal("Ana Martínez", 104, 18.0, 80));

        System.out.println("--- Lista de Empleados ---\n");
        for (Empleado emp : empleados) {
            emp.mostrarInfo();
            System.out.println();
        }

        System.out.println("--- Clasificación por tipo ---\n");
        int plantaCount = 0;
        int temporalCount = 0;
        double totalPlanta = 0;
        double totalTemporal = 0;

        for (Empleado emp : empleados) {
            if (emp instanceof EmpleadoPlanta) {
                plantaCount++;
                totalPlanta += emp.calcularSueldo();
                System.out.println(emp.getNombre() + " - Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                temporalCount++;
                totalTemporal += emp.calcularSueldo();
                System.out.println(emp.getNombre() + " - Empleado Temporal");
            }
        }

        System.out.println("\n--- Resumen ---");
        System.out.println("Empleados de planta: " + plantaCount + " - Total Sueldos: $" + String.format("%.2f", totalPlanta));
        System.out.println("Empleados temporales: " + temporalCount + " - Total Sueldos: $" + String.format("%.2f", totalTemporal));
        System.out.println("Nómina total: $" + String.format("%.2f", (totalPlanta + totalTemporal)));
    }
}
