package dev.andresbonelli.figurasGeometricas;

abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarInfo() {
        System.out.println("Tipo: " + nombre);
        System.out.println("Área: " + String.format("%.2f", calcularArea()) + " m²");
    }
}
