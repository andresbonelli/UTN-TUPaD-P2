package dev.andresbonelli.empleadosPolimorfismo;

class EmpleadoPlanta extends Empleado {
    private final double sueldoBase;
    private final double bonificacion;

    public EmpleadoPlanta(String nombre, int id, double sueldoBase, double bonificacion) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bonificacion;
    }
}
