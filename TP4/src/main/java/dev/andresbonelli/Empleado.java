package dev.andresbonelli;


public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;

    private static int siguienteId = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        // Actualizar el siguiente ID si es necesario
        if (id >= siguienteId) {
            siguienteId = id + 1;
        }
    }

    /**
     * Constructor que recibe solo nombre, puesto y salario y
     * asigna un ID automáticamente y un salario por defecto.
     */
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 45000.0; // Salario por defecto
        totalEmpleados++;
        siguienteId++;
    }

    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario = this.salario + (this.salario * porcentaje / 100);
            System.out.println("Salario actualizado con " + porcentaje + "% de aumento.");
        } else {
            // En caso de error imprimir tambien la ID del empleado para encontrar en logs.
            System.out.println("[ERROR] - El porcentaje a aumentar debe ser positivo. Empleado ID: "+this.id);
        }
    }

    /**
     * Sobrecarga que actualiza el salario con una cantidad fija.
     */
    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            this.salario = this.salario + cantidadFija;
            System.out.println("Salario actualizado con $" + cantidadFija + " de aumento fijo.");
        } else {
            System.out.println("[ERROR] - La cantidad a aumentar debe ser positiva. Empleado ID: "+this.id);
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre='%s', puesto='%s', salario=$%.2f}",
                this.id, this.nombre, this.puesto, this.salario);
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return this.salario;
    }

}
