public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }
    public Conductor getConductor() { return conductor; }
}