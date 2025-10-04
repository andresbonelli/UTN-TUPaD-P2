package dev.andresbonelli.empleadosPolimorfismo;

class EmpleadoTemporal extends Empleado {
    private final double tarifaPorHora;
    private final int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
}
