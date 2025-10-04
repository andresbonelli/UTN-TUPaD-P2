package dev.andresbonelli.empleadosPolimorfismo;

abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSueldo();

    public void mostrarInfo() {
        System.out.println("ID: " + id + " - Nombre: " + nombre);
        System.out.println("Sueldo: $" + String.format("%.2f", calcularSueldo()));
    }

    public String getNombre() {
        return nombre;
    }
}
